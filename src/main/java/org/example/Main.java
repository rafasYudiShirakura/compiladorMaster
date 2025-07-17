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
            System.err.println("Exemplo: src/main/java/org/example/testeErroSemantico.txt");
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
        
        System.out.println("\n--- Análise Léxica - Tokens Encontrados ---");
        exibirTokens(tokens);
        
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

    private static void exibirTokens(CommonTokenStream tokens) {
        ObjectOrientedLexer lexer = (ObjectOrientedLexer) tokens.getTokenSource();
        tokens.fill();
        
        System.out.println("Total de tokens encontrados: " + tokens.size());
        System.out.println("Formato: [Tipo] Valor (Linha:Coluna)");
        System.out.println("----------------------------------------");
        
        for (int i = 0; i < tokens.size(); i++) {
            Token token = tokens.get(i);
            
            if (token.getType() == Token.EOF) {
                System.out.println("[EOF] <fim_do_arquivo> (" + token.getLine() + ":" + token.getCharPositionInLine() + ")");
                break;
            }
            
            String nomeToken = obterNomeTokenSimbolico(token.getType());
            String valor = token.getText();
            
            if (valor.equals("\n") || valor.equals("\r\n")) {
                valor = "<nova_linha>";
            } else if (valor.equals("\t")) {
                valor = "<tab>";
            } else if (valor.equals(" ")) {
                valor = "<espaço>";
            }
            
            System.out.printf("[%s] %s (%d:%d)%n", 
                nomeToken, 
                valor, 
                token.getLine(), 
                token.getCharPositionInLine());
        }
        
        System.out.println("----------------------------------------");
    }
    
    private static String obterNomeTokenSimbolico(int tipoToken) {
        String[] nomesSimbolicos = ObjectOrientedLexer.VOCABULARY.getSymbolicName(tipoToken) != null ? 
            new String[]{ObjectOrientedLexer.VOCABULARY.getSymbolicName(tipoToken)} : 
            new String[]{"DESCONHECIDO"};
        
        if (nomesSimbolicos[0] != null) {
            return nomesSimbolicos[0];
        }

        return switch (tipoToken) {
            case ObjectOrientedLexer.CLASS -> "CLASS";
            case ObjectOrientedLexer.PUBLIC -> "PUBLIC";
            case ObjectOrientedLexer.PRIVATE -> "PRIVATE";
            case ObjectOrientedLexer.FINAL -> "FINAL";
            case ObjectOrientedLexer.VOID -> "VOID";
            case ObjectOrientedLexer.BOOLEAN -> "BOOLEAN";
            case ObjectOrientedLexer.CHAR -> "CHAR";
            case ObjectOrientedLexer.INT -> "INT";
            case ObjectOrientedLexer.LONG -> "LONG";
            case ObjectOrientedLexer.FLOAT -> "FLOAT";
            case ObjectOrientedLexer.DOUBLE -> "DOUBLE";
            case ObjectOrientedLexer.IF -> "IF";
            case ObjectOrientedLexer.ELSE -> "ELSE";
            case ObjectOrientedLexer.FOR -> "FOR";
            case ObjectOrientedLexer.WHILE -> "WHILE";
            case ObjectOrientedLexer.DO -> "DO";
            case ObjectOrientedLexer.RETURN -> "RETURN";
            case ObjectOrientedLexer.PRINTF -> "PRINTF";
            case ObjectOrientedLexer.SCANF -> "SCANF";
            case ObjectOrientedLexer.BOOLEAN_LITERAL -> "BOOLEAN_LITERAL";
            case ObjectOrientedLexer.INTEGER_LITERAL -> "INTEGER_LITERAL";
            case ObjectOrientedLexer.FLOAT_LITERAL -> "FLOAT_LITERAL";
            case ObjectOrientedLexer.CHAR_LITERAL -> "CHAR_LITERAL";
            case ObjectOrientedLexer.STRING_LITERAL -> "STRING_LITERAL";
            case ObjectOrientedLexer.IDENTIFIER -> "IDENTIFIER";
            case ObjectOrientedLexer.LPAREN -> "LPAREN";
            case ObjectOrientedLexer.RPAREN -> "RPAREN";
            case ObjectOrientedLexer.LBRACE -> "LBRACE";
            case ObjectOrientedLexer.RBRACE -> "RBRACE";
            case ObjectOrientedLexer.LBRACK -> "LBRACK";
            case ObjectOrientedLexer.RBRACK -> "RBRACK";
            case ObjectOrientedLexer.SEMI -> "SEMI";
            case ObjectOrientedLexer.COMMA -> "COMMA";
            case ObjectOrientedLexer.DOT -> "DOT";
            case ObjectOrientedLexer.ASSIGN -> "ASSIGN";
            case ObjectOrientedLexer.GT -> "GT";
            case ObjectOrientedLexer.LT -> "LT";
            case ObjectOrientedLexer.BANG -> "BANG";
            case ObjectOrientedLexer.TILDE -> "TILDE";
            case ObjectOrientedLexer.QUESTION -> "QUESTION";
            case ObjectOrientedLexer.COLON -> "COLON";
            case ObjectOrientedLexer.EQUAL -> "EQUAL";
            case ObjectOrientedLexer.LE -> "LE";
            case ObjectOrientedLexer.GE -> "GE";
            case ObjectOrientedLexer.NOTEQUAL -> "NOTEQUAL";
            case ObjectOrientedLexer.AND -> "AND";
            case ObjectOrientedLexer.OR -> "OR";
            case ObjectOrientedLexer.INC -> "INC";
            case ObjectOrientedLexer.DEC -> "DEC";
            case ObjectOrientedLexer.ADD -> "ADD";
            case ObjectOrientedLexer.SUB -> "SUB";
            case ObjectOrientedLexer.MUL -> "MUL";
            case ObjectOrientedLexer.DIV -> "DIV";
            case ObjectOrientedLexer.BITAND -> "BITAND";
            case ObjectOrientedLexer.BITOR -> "BITOR";
            case ObjectOrientedLexer.CARET -> "CARET";
            case ObjectOrientedLexer.MOD -> "MOD";
            default -> "TOKEN_" + tipoToken;
        };
    }
}