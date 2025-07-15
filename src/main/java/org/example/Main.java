
package org.example;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import org.example.output.generated.ObjectOrientedParser;
import org.example.output.generated.ObjectOrientedLexer;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) {
        String inputFile = "/home/lucas-fedora/Desktop/compiladorMaster/src/main/java/org/example/teste.txt";

        System.out.println("Processing file: " + inputFile);
        System.out.println("=====================================");

        try (InputStream is = new FileInputStream(inputFile)) {
            CharStream input = CharStreams.fromStream(is);
            processStream(input, inputFile);
        } catch (IOException e) {
            System.err.println("Error reading file " + inputFile + ": " + e.getMessage());
            System.err.println("Make sure the file exists in the project root directory.");
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Error processing file " + inputFile + ": " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void processStream(CharStream input, String sourceName) throws Exception {
        System.out.println("Input content:");
        System.out.println(input.toString());
        System.out.println("=====================================");

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
            System.out.println("\n--- Running Semantic Analysis ---");

            ParseTreeWalker walker = new ParseTreeWalker();
            MyLanguageSemanticAnalyzer semanticAnalyzer = new MyLanguageSemanticAnalyzer();
            walker.walk((ParseTreeListener) semanticAnalyzer, tree);

            System.out.println("\n--- Semantic Analysis Results ---");
            if (semanticAnalyzer.hasErrors()) {
                System.out.println("❌ Semantic analysis completed with " + semanticAnalyzer.getErrors().size() + " error(s)");
            } else {
                System.out.println("✅ Semantic analysis completed successfully - No errors found");
            }

        } else {
            System.out.println("❌ Parsing failed with " + parser.getNumberOfSyntaxErrors() + " syntax error(s)");
        }
    }
}