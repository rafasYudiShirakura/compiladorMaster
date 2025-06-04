package org.example;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


public class Main {

    public static void main(String[] args) {
        String inputFile = null;
        if (args.length > 0) {
            inputFile = args[0];
        } else {
            System.err.println("No input file provided. Usage: java Main <input-file>");
            // Example: Create a dummy input stream for testing if no file is provided
            // String testCode = "class MyClass { public void main() { int x = 10; } }";
            // InputStream stream = new java.io.ByteArrayInputStream(testCode.getBytes());
            // System.out.println("No input file provided. Using a test string instead.");
            // processStream(stream, "test string");
            return;
        }

        // Inside your main method in Main.java
        try (InputStream is = new FileInputStream(inputFile)) {
            // Convert InputStream 'is' to CharStream 'input' before calling processStream
            CharStream input = CharStreams.fromStream(is); // Create CharStream here
            processStream(input, inputFile);              // Pass the CharStream
        } catch (IOException e) { // It's good practice to catch IOException from FileInputStream/fromStream
            System.err.println("Error reading file " + inputFile + ": " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) { // General exception for other errors
            System.err.println("Error processing file " + inputFile + ": " + e.getMessage());
            e.printStackTrace();
        }
    }

    // In Main.java, inside the processStream method:
    private static void processStream(CharStream input, String sourceName) throws Exception {
        System.out.println("Processing: " + sourceName);

        ObjectOrientedLexer lexer = new ObjectOrientedLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ObjectOrientedParser parser = new ObjectOrientedParser(tokens);

        parser.removeErrorListeners();
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                    int line, int charPositionInLine, String msg,
                                    RecognitionException e) {
                System.err.println("Syntax Error at " + sourceName + " line " + line + ":" + charPositionInLine + " " + msg);
            }
        });

        ParseTree tree = parser.compilationUnit();

        // System.out.println("\nParse Tree (LISP format):"); // You can keep or comment this out
        // System.out.println(tree.toStringTree(parser));

        if (parser.getNumberOfSyntaxErrors() == 0) {
            System.out.println("\nParsing completed successfully for: " + sourceName);

            // **** NEW PART: Walk the tree with your listener ****
            System.out.println("\n--- Running Semantic Analyzer (Listener) ---");
            ParseTreeWalker walker = new ParseTreeWalker();
            MyLanguageSemanticAnalyzer semanticAnalyzer = new MyLanguageSemanticAnalyzer();
            walker.walk(semanticAnalyzer, tree);
            System.out.println("--- Semantic Analyzer Finished ---");
            // **************************************************

        } else {
            System.out.println("\nParsing completed with " + parser.getNumberOfSyntaxErrors() + " syntax error(s) for: " + sourceName);
        }
    }
}

// Placeholder for your actual lexer and parser if they are not in a package.
// If they are in a package (e.g., com.yourlanguage.parser), you should import them
// at the top of the file and can remove these dummy classes.
// Ensure your ANTLR-generated ObjectOrientedLexer.java and ObjectOrientedParser.java
// are compiled and on the classpath.

/*
class ObjectOrientedLexer extends Lexer {
    public ObjectOrientedLexer(CharStream input) { super(input); }
    // ... ANTLR generated content ...
    @Override public String[] getRuleNames() { return null; }
    @Override public String getGrammarFileName() { return null; }
    @Override public Vocabulary getVocabulary() { return null; }
}

class ObjectOrientedParser extends Parser {
    public ObjectOrientedParser(TokenStream input) { super(input); }
    // ... ANTLR generated content ...
    public ParseTree compilationUnit() { return null; } // Example entry rule
    @Override public String[] getRuleNames() { return null; }
    @Override public String getGrammarFileName() { return null; }
    @Override public ATN getATN() { return null; }
}
*/
