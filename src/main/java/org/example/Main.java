package org.example;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.example.output.generated.ObjectOrientedLexer;
import org.example.output.generated.ObjectOrientedParser;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) {
        // Verifica se o caminho do arquivo foi passado como argumento
        if (args.length == 0) {
            System.err.println("Por favor, forneça o caminho para o arquivo de entrada como um argumento.");
            System.err.println("Exemplo: src/main/java/org/example/teste.txt");
            return;
        }
        String inputFile = args[0];

        System.out.println("Processing file: " + inputFile);
        System.out.println("=====================================");

        try (InputStream is = new FileInputStream(inputFile)) {
            CharStream input = CharStreams.fromStream(is);
            processStream(input, inputFile);
        } catch (IOException e) {
            System.err.println("Error reading file " + inputFile + ": " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Error processing file " + inputFile + ": " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void processStream(CharStream input, String sourceName) throws Exception {
        ObjectOrientedLexer lexer = new ObjectOrientedLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ObjectOrientedParser parser = new ObjectOrientedParser(tokens);

        parser.removeErrorListeners();
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                    int line, int charPositionInLine, String msg,
                                    RecognitionException e) {
                System.err.println("SYNTAX ERROR at line " + line + ":" + charPositionInLine + " " + msg);
            }
        });

        ParseTree tree = parser.compilationUnit();

        if (parser.getNumberOfSyntaxErrors() == 0) {
            System.out.println("✓ Parsing completed successfully");

            // Análise Semântica
            System.out.println("\n--- Running Semantic Analysis ---");
            MyLanguageSemanticAnalyzer semanticAnalyzer = new MyLanguageSemanticAnalyzer();
            ParseTreeWalker.DEFAULT.walk(semanticAnalyzer, tree);

            if (semanticAnalyzer.hasErrors()) {
                System.out.println("❌ Semantic analysis completed with " + semanticAnalyzer.getErrors().size() + " error(s).");
                for(String error : semanticAnalyzer.getErrors()){
                    System.err.println(error);
                }
            } else {
                System.out.println("✅ Semantic analysis completed successfully - No errors found.");

                // Geração de Código Intermediário
                System.out.println("\n--- Generating Intermediate Code ---");
                IntermediateCodeGenerator codeGenerator = new IntermediateCodeGenerator();
                codeGenerator.visit(tree);
                System.out.println(codeGenerator.getIRCode());
                codeGenerator.generateFile("output.ll");
            }

        } else {
            System.out.println("❌ Parsing failed with " + parser.getNumberOfSyntaxErrors() + " syntax error(s)");
        }
    }
}