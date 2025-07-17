package org.example;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.example.output.generated.ObjectOrientedLexer;
import org.example.output.generated.ObjectOrientedParser;
import org.example.ast.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Por favor, forneça o caminho para o arquivo de entrada como um argumento.");
            System.err.println("Exemplo: src/main/java/org/example/testeCompleto.txt");
            return;
        }
        String arquivoEntrada = args[0];

        System.out.println("Processando arquivo: " + arquivoEntrada);
        System.out.println("=====================================");

        try (InputStream is = new FileInputStream(arquivoEntrada)) {
            CharStream entrada = CharStreams.fromStream(is);
            processarFluxo(entrada, arquivoEntrada);
        } catch (IOException e) {
            System.err.println("Erro ao ler arquivo " + arquivoEntrada + ": " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Erro ao processar arquivo " + arquivoEntrada + ": " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void processarFluxo(CharStream entrada, String nomeOrigem) throws Exception {
        ObjectOrientedLexer analisadorLexico = new ObjectOrientedLexer(entrada);
        CommonTokenStream tokens = new CommonTokenStream(analisadorLexico);
        ObjectOrientedParser analisadorSintatico = new ObjectOrientedParser(tokens);

        analisadorSintatico.removeErrorListeners();
        analisadorSintatico.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                    int line, int charPositionInLine, String msg,
                                    RecognitionException e) {
                System.err.println("ERRO SINTÁTICO na linha " + line + ":" + charPositionInLine + " " + msg);
            }
        });

        ParseTree arvore = analisadorSintatico.compilationUnit();

        if (analisadorSintatico.getNumberOfSyntaxErrors() == 0) {
            System.out.println("Análise sintática concluída com sucesso");

            System.out.println("\n--- Gerando Árvore Sintática Abstrata (AST) ---");
            ASTBuilder construtor = new ASTBuilder();
            ASTNode raizAST = construtor.visit(arvore);
            
            if (raizAST != null) {
                ASTVisualizer.printAST(raizAST);
                ASTVisualizer.saveASTToFile(raizAST, "ast_output.txt");
                ASTVisualizer.saveDotFile(raizAST, "ast_graph.dot");
                ASTVisualizer.printASTStatistics(raizAST);
                
                System.out.println("Geração da AST concluída com sucesso!");
            } else {
                System.out.println("Falha ao gerar AST");
            }

            System.out.println("\n--- Executando Análise Semântica ---");
            MyLanguageSemanticAnalyzer analisadorSemantico = new MyLanguageSemanticAnalyzer();
            ParseTreeWalker.DEFAULT.walk(analisadorSemantico, arvore);

            if (analisadorSemantico.temErros()) {
                System.out.println("Análise semântica concluída com " + analisadorSemantico.obterErros().size() + " erro(s).");
                for(String erro : analisadorSemantico.obterErros()){
                    System.err.println(erro);
                }
            } else {
                System.out.println("Análise semântica concluída com sucesso - Nenhum erro encontrado.");

                System.out.println("\n--- Gerando Código Intermediário ---");
                IntermediateCodeGenerator geradorCodigo = new IntermediateCodeGenerator();
                geradorCodigo.visit(arvore);
                System.out.println(geradorCodigo.getIRCode());
                geradorCodigo.generateFile("output.ll");
            }

        } else {
            System.out.println("Análise sintática falhou com " + analisadorSintatico.getNumberOfSyntaxErrors() + " erro(s) sintático(s)");
        }
    }
}