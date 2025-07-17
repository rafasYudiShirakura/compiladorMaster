package org.example.ast;

import java.io.FileWriter;
import java.io.IOException;

public class ASTVisualizer {
    
    public static void printAST(ASTNode root) {
        System.out.println("\n=== Árvore de sintaxe abstrata (AST) ===");
        System.out.println("AST Raiz: " + root.toString());
        System.out.println(root.toTreeString(0));
        System.out.println("===================================");
    }
    
    public static void saveASTToFile(ASTNode root, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("=== Árvore de sintaxe abstrata (AST) ===\n");
            writer.write("AST Raiz: " + root.toString() + "\n");
            writer.write(root.toTreeString(0));
            writer.write("===================================\n");
            System.out.println("AST salva em: " + filename);
        } catch (IOException e) {
            System.err.println("Erro ao salvar AST no arquivo: " + e.getMessage());
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
            System.out.println("AST DOT arquivo salvo: " + filename);
            
            generateASTImage(filename);
            
        } catch (IOException e) {
            System.err.println("Erro ao salvar DOT file: " + e.getMessage());
        }
    }
    
    public static void generateASTImage(String dotFilename) {
        try {
            String pngFilename = dotFilename.replace(".dot", ".png");
            
            ProcessBuilder pb = new ProcessBuilder("dot", "-Tpng", dotFilename, "-o", pngFilename);
            pb.redirectErrorStream(true);
            
            Process process = pb.start();
            int exitCode = process.waitFor();
            
            if (exitCode == 0) {
                System.out.println("Imagem da AST gerada com sucesso: " + pngFilename);
            } else {
                tryAlternativeImageGeneration(dotFilename, pngFilename);
            }
            
        } catch (Exception e) {
            System.out.println("Imagem AST não gerada. Graphviz 'dot' comando não encontrado.");
            System.out.println("   Instale Graphviz e adicione ao PATH, ou faça manualmente:");
            System.out.println("   dot -Tpng " + dotFilename + " -o ast.png");
            
            generateTextBasedVisualization(dotFilename);
        }
    }
    
    private static void tryAlternativeImageGeneration(String dotFilename, String pngFilename) {
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
                // Sem tratamento
            }
        }
        
        System.out.println("Imagem AST não gerada. Instale o Graphviz:");
        System.out.println("   1. Site para instalação: https://graphviz.org/download/");
        System.out.println("   2. Adicione ao PATH do sistema");
        System.out.println("   3. Ou execute manualmente: dot -Tpng " + dotFilename + " -o " + pngFilename);
        
        generateTextBasedVisualization(dotFilename);
    }
    
    private static void generateTextBasedVisualization(String dotFilename) {
        try {
            String textVizFilename = dotFilename.replace(".dot", "_visualization.txt");
            
            try (FileWriter writer = new FileWriter(textVizFilename)) {
                writer.write("=== VISUALIZAÇÃO DA AST ===\n");
                writer.write("ISSO É UMA REPRESENTAÇÃO TEXTUAL DA AST.\n");
                writer.write("PARA UMA VISUALIZAÇÃO GRÁFICA, INSTALE O GRAPHVIZ: https://graphviz.org/download/\n\n");
                
                java.nio.file.Path dotPath = java.nio.file.Paths.get(dotFilename);
                if (java.nio.file.Files.exists(dotPath)) {
                    java.util.List<String> lines = java.nio.file.Files.readAllLines(dotPath);
                    
                    writer.write("AST Estrutura (Arquivo DOT):\n");
                    for (String line : lines) {
                        if (line.contains("label=")) {
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
            
            System.out.println("Visualização textual da AST salva em: " + textVizFilename);
            
        } catch (Exception e) {
            System.err.println("Não foi possivel gerar a visualização textual da AST: " + e.getMessage());
        }
    }
    
    public static void printASTStatistics(ASTNode root) {
        ASTStatistics stats = new ASTStatistics();
        collectStatistics(root, stats);
        
        System.out.println("\n=== AST Estatisticas ===");
        System.out.println("Quantidade de nós: " + stats.totalNodes);
        System.out.println("Classes: " + stats.classes);
        System.out.println("Métodos: " + stats.methods);
        System.out.println("Campos: " + stats.fields);
        System.out.println("Parametros: " + stats.parameters);
        System.out.println("Declarações: " + stats.statements);
        System.out.println("Expressões: " + stats.expressions);
        System.out.println("Literais: " + stats.literals);
        System.out.println("Profundidade Máxima: " + getMaxDepth(root, 0));
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