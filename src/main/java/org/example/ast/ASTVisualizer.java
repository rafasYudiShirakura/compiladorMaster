package org.example.ast;

import java.io.FileWriter;
import java.io.IOException;

public class ASTVisualizer {
    
    public static void printAST(ASTNode root) {
        System.out.println("\n=== ABSTRACT SYNTAX TREE (AST) ===");
        System.out.println("AST Root: " + root.toString());
        System.out.println(root.toTreeString(0));
        System.out.println("===================================");
    }
    
    public static void saveASTToFile(ASTNode root, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("=== ABSTRACT SYNTAX TREE (AST) ===\n");
            writer.write("AST Root: " + root.toString() + "\n");
            writer.write(root.toTreeString(0));
            writer.write("===================================\n");
            System.out.println("AST saved to: " + filename);
        } catch (IOException e) {
            System.err.println("Error saving AST to file: " + e.getMessage());
        }
    }
    
    public static String generateDotFormat(ASTNode root) {
        StringBuilder dot = new StringBuilder();
        dot.append("digraph AST {\n");
        dot.append("  node [shape=box, style=filled, fillcolor=lightblue];\n");
        dot.append("  rankdir=TB;\n");
        
        generateDotNodes(root, dot, 0);
        
        dot.append("}\n");
        return dot.toString();
    }
    
    private static int generateDotNodes(ASTNode node, StringBuilder dot, int nodeId) {
        int currentId = nodeId;
        String nodeLabel = node.toString().replace("\"", "\\\"");
        
        // Set different colors for different node types
        String fillColor = getNodeColor(node.getNodeType());
        dot.append("  node").append(currentId)
           .append(" [label=\"").append(nodeLabel).append("\", fillcolor=").append(fillColor).append("];\n");
        
        int childId = currentId + 1;
        for (ASTNode child : node.getChildren()) {
            dot.append("  node").append(currentId).append(" -> node").append(childId).append(";\n");
            childId = generateDotNodes(child, dot, childId);
        }
        
        return childId;
    }
    
    private static String getNodeColor(String nodeType) {
        switch (nodeType) {
            case "CLASS": return "lightcoral";
            case "METHOD": return "lightgreen";
            case "FIELD": return "lightyellow";
            case "PARAMETER": return "lightcyan";
            case "STATEMENT": return "lightpink";
            case "EXPRESSION": return "lightgray";
            case "LITERAL": return "lightsteelblue";
            case "BLOCK": return "wheat";
            default: return "lightblue";
        }
    }
    
    public static void saveDotFile(ASTNode root, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(generateDotFormat(root));
            System.out.println("AST DOT file saved to: " + filename);
            
            // Automatically generate PNG image
            generateASTImage(filename);
            
        } catch (IOException e) {
            System.err.println("Error saving DOT file: " + e.getMessage());
        }
    }
    
    public static void generateASTImage(String dotFilename) {
        try {
            String pngFilename = dotFilename.replace(".dot", ".png");
            
            // Try to execute dot command to generate PNG
            ProcessBuilder pb = new ProcessBuilder("dot", "-Tpng", dotFilename, "-o", pngFilename);
            pb.redirectErrorStream(true);
            
            Process process = pb.start();
            int exitCode = process.waitFor();
            
            if (exitCode == 0) {
                System.out.println("AST image generated successfully: " + pngFilename);
            } else {
                // If dot command fails, try alternative methods
                tryAlternativeImageGeneration(dotFilename, pngFilename);
            }
            
        } catch (Exception e) {
            System.out.println("Could not auto-generate AST image. Graphviz 'dot' command not found.");
            System.out.println("   Install Graphviz and add to PATH, or manually run:");
            System.out.println("   dot -Tpng " + dotFilename + " -o ast.png");
            
            // Try to generate a simple text-based visualization as fallback
            generateTextBasedVisualization(dotFilename);
        }
    }
    
    private static void tryAlternativeImageGeneration(String dotFilename, String pngFilename) {
        // Try common Graphviz installation paths on Windows
        String[] possiblePaths = {
            "C:\\Program Files\\Graphviz\\bin\\dot.exe",
            "C:\\Program Files (x86)\\Graphviz\\bin\\dot.exe",
            "C:\\Tools\\Graphviz\\bin\\dot.exe",
            "dot.exe"
        };
        
        for (String dotPath : possiblePaths) {
            try {
                ProcessBuilder pb = new ProcessBuilder(dotPath, "-Tpng", dotFilename, "-o", pngFilename);
                pb.redirectErrorStream(true);
                
                Process process = pb.start();
                int exitCode = process.waitFor();
                
                if (exitCode == 0) {
                    System.out.println("AST image generated successfully: " + pngFilename);
                    return;
                }
            } catch (Exception e) {
                // Continue trying other paths
            }
        }
        
        System.out.println("Could not auto-generate AST image. Please install Graphviz:");
        System.out.println("   1. Download from: https://graphviz.org/download/");
        System.out.println("   2. Add to system PATH");
        System.out.println("   3. Or manually run: dot -Tpng " + dotFilename + " -o " + pngFilename);
        
        generateTextBasedVisualization(dotFilename);
    }
    
    private static void generateTextBasedVisualization(String dotFilename) {
        try {
            String textVizFilename = dotFilename.replace(".dot", "_visualization.txt");
            
            try (FileWriter writer = new FileWriter(textVizFilename)) {
                writer.write("=== AST VISUAL REPRESENTATION ===\n");
                writer.write("This is a text-based representation of your AST.\n");
                writer.write("For a graphical image, install Graphviz from: https://graphviz.org/download/\n\n");
                
                // Read the DOT file and create a simplified text visualization
                java.nio.file.Path dotPath = java.nio.file.Paths.get(dotFilename);
                if (java.nio.file.Files.exists(dotPath)) {
                    java.util.List<String> lines = java.nio.file.Files.readAllLines(dotPath);
                    
                    writer.write("AST Structure (from DOT file):\n");
                    for (String line : lines) {
                        if (line.contains("label=")) {
                            // Extract and format node information
                            String cleaned = line.trim()
                                               .replaceAll("node\\d+", "")
                                               .replaceAll("\\[label=\"", "• ")
                                               .replaceAll("\", fillcolor=.*\\];", "")
                                               .replaceAll("->", "  └─");
                            if (!cleaned.trim().isEmpty() && !cleaned.contains("digraph") && !cleaned.contains("node [")) {
                                writer.write(cleaned + "\n");
                            }
                        }
                    }
                }
            }
            
            System.out.println("Text-based AST visualization saved to: " + textVizFilename);
            
        } catch (Exception e) {
            System.err.println("Could not generate text-based visualization: " + e.getMessage());
        }
    }
    
    public static void printASTStatistics(ASTNode root) {
        ASTStatistics stats = new ASTStatistics();
        collectStatistics(root, stats);
        
        System.out.println("\n=== AST STATISTICS ===");
        System.out.println("Total nodes: " + stats.totalNodes);
        System.out.println("Classes: " + stats.classes);
        System.out.println("Methods: " + stats.methods);
        System.out.println("Fields: " + stats.fields);
        System.out.println("Parameters: " + stats.parameters);
        System.out.println("Statements: " + stats.statements);
        System.out.println("Expressions: " + stats.expressions);
        System.out.println("Literals: " + stats.literals);
        System.out.println("Max depth: " + getMaxDepth(root, 0));
        System.out.println("======================");
    }
    
    private static void collectStatistics(ASTNode node, ASTStatistics stats) {
        stats.totalNodes++;
        
        switch (node.getNodeType()) {
            case "CLASS": stats.classes++; break;
            case "METHOD": stats.methods++; break;
            case "FIELD": stats.fields++; break;
            case "PARAMETER": stats.parameters++; break;
            case "STATEMENT": stats.statements++; break;
            case "EXPRESSION": stats.expressions++; break;
            case "LITERAL": stats.literals++; break;
        }
        
        for (ASTNode child : node.getChildren()) {
            collectStatistics(child, stats);
        }
    }
    
    private static int getMaxDepth(ASTNode node, int currentDepth) {
        int maxDepth = currentDepth;
        
        for (ASTNode child : node.getChildren()) {
            int childDepth = getMaxDepth(child, currentDepth + 1);
            maxDepth = Math.max(maxDepth, childDepth);
        }
        
        return maxDepth;
    }
    
    private static class ASTStatistics {
        int totalNodes = 0;
        int classes = 0;
        int methods = 0;
        int fields = 0;
        int parameters = 0;
        int statements = 0;
        int expressions = 0;
        int literals = 0;
    }
}