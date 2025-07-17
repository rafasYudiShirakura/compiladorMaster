package org.example;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.example.output.generated.ObjectOrientedParser;
import org.example.output.generated.ObjectOrientedParserBaseVisitor;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntermediateCodeGenerator extends ObjectOrientedParserBaseVisitor<Void> {

    private final StringBuilder codigoLlvm = new StringBuilder();
    private int contadorRotulos = 0;
    private int contadorVariavelTemporaria = 0;
    private final Map<String, String> tabelaSimbolos = new HashMap<>();

    private String novoRotulo() {
        return "L" + (contadorRotulos++);
    }

    private String novaTemporaria() {
        return "%t" + (contadorVariavelTemporaria++);
    }

    private String paraLLVMTipo(String tipo) {
        switch (tipo) {
            case "frequenciaMHz":
            case "inteiro":
                return "i32";
            case "tensaoVolts":
            case "real":
                return "double";
            case "codigoPostDisplay":
            case "caractere":
                return "i8";
            case "string":
                return "i8*";
            case "void":
                return "void";
            default:
                if (tipo.endsWith("]")) {
                    String tipoBase = tipo.substring(0, tipo.indexOf('['));
                    String tipoBaseLlvm = paraLLVMTipo(tipoBase);
                    String tamanho = tipo.substring(tipo.indexOf('[') + 1, tipo.indexOf(']'));
                    return "[" + tamanho + " x " + tipoBaseLlvm + "]";
                }
                return "i32";
        }
    }

    @Override
    public Void visitClassDeclaration(ObjectOrientedParser.ClassDeclarationContext ctx) {
        String nomeClasse = ctx.IDENTIFIER().getText();
        codigoLlvm.append("; ModuleID = '").append(nomeClasse).append("'\n");
        codigoLlvm.append("source_filename = \"").append(nomeClasse).append(".cid\"\n\n");
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitFieldDeclaration(ObjectOrientedParser.FieldDeclarationContext ctx) {
        String tipo = ctx.type().getText();
        String tipoLlvm = paraLLVMTipo(tipo);

        for (ObjectOrientedParser.VariableDeclaratorContext varCtx : ctx.variableDeclaratorList().variableDeclarator()) {
            String nomeVariavel = varCtx.IDENTIFIER().getText();
            tabelaSimbolos.put(nomeVariavel, tipo);

            if (varCtx.LBRACK().size() > 0) {
                codigoLlvm.append("@").append(nomeVariavel).append(" = common global [10 x ").append(tipoLlvm).append("] zeroinitializer, align 16\n");
            } else {
                codigoLlvm.append("@").append(nomeVariavel).append(" = common global ").append(tipoLlvm).append(" 0, align 4\n");
            }
        }
        return null;
    }

    @Override
    public Void visitMethodDeclaration(ObjectOrientedParser.MethodDeclarationContext ctx) {
        String nomeMetodo = ctx.IDENTIFIER().getText();
        String tipoRetorno = ctx.typeOrVoid().getText();
        String tipoRetornoLlvm = paraLLVMTipo(tipoRetorno);

        StringBuilder parametros = new StringBuilder();
        if (ctx.formalParameterList() != null) {
            boolean primeiro = true;
            if (ctx.formalParameterList().formalParameter() != null) {
                for (var param : ctx.formalParameterList().formalParameter()) {
                    if (!primeiro) {
                        parametros.append(", ");
                    }
                    String tipoParam = param.type().getText();
                    String nomeParam = param.variableDeclaratorId().getText();
                    String tipoParamLlvm = paraLLVMTipo(tipoParam);
                    parametros.append(tipoParamLlvm).append(" %").append(nomeParam);
                    tabelaSimbolos.put(nomeParam, tipoParam);
                    primeiro = false;
                }
            }
        }

        codigoLlvm.append("\ndefine ").append(tipoRetornoLlvm).append(" @").append(nomeMetodo).append("(").append(parametros.toString()).append(") #0 {\n");

        visit(ctx.block());

        if (tipoRetornoLlvm.equals("void")) {
            codigoLlvm.append("  ret void\n");
        } else if (!codigoLlvm.toString().endsWith("ret i32 0\n")) {
            codigoLlvm.append("  ret ").append(tipoRetornoLlvm).append(" 0\n");
        }

        codigoLlvm.append("}\n");
        tabelaSimbolos.clear();
        return null;
    }

    @Override
    public Void visitBlock(ObjectOrientedParser.BlockContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Void visitStatement(ObjectOrientedParser.StatementContext ctx) {
        if (ctx.RETURN() != null && ctx.expression() != null && !ctx.expression().isEmpty()) {
            String valor = ctx.expression(0).getText();
            String varTemporaria = novaTemporaria();

            if (tabelaSimbolos.containsKey(valor)) {
                String tipo = tabelaSimbolos.get(valor);
                String tipoLlvm = paraLLVMTipo(tipo);
                codigoLlvm.append("  ").append(varTemporaria).append(" = load ").append(tipoLlvm).append(", ").append(tipoLlvm).append("* %").append(valor).append(", align 4\n");
                codigoLlvm.append("  ret ").append(tipoLlvm).append(" ").append(varTemporaria).append("\n");
            } else {
                String tipoLlvm = paraLLVMTipo("inteiro");
                if(valor.contains(".")) tipoLlvm = paraLLVMTipo("real");
                codigoLlvm.append("  ret ").append(tipoLlvm).append(" ").append(valor).append("\n");
            }

        } else if (ctx.IF() != null) {
            String varCondicao = novaTemporaria();
            String rotuloEntao = novoRotulo();
            String rotuloSenao = novoRotulo();
            String rotuloFim = novoRotulo();

            visit(ctx.parExpression().expression());
            String ultimaTemporaria = "%t" + (contadorVariavelTemporaria - 1);

            codigoLlvm.append("  ").append(varCondicao).append(" = icmp ne i32 ").append(ultimaTemporaria).append(", 0\n");
            codigoLlvm.append("  br i1 ").append(varCondicao).append(", label %").append(rotuloEntao).append(", label %").append(rotuloSenao).append("\n");

            codigoLlvm.append(rotuloEntao).append(":\n");
            visit(ctx.statement(0));
            codigoLlvm.append("  br label %").append(rotuloFim).append("\n");

            codigoLlvm.append(rotuloSenao).append(":\n");
            if (ctx.ELSE() != null) {
                visit(ctx.statement(1));
            }
            codigoLlvm.append("  br label %").append(rotuloFim).append("\n");

            codigoLlvm.append(rotuloFim).append(":\n");
        }

        return visitChildren(ctx);
    }

    @Override
    public Void visitExpression(ObjectOrientedParser.ExpressionContext ctx) {
        if (ctx.assignmentExpression() != null && ctx.assignmentExpression().conditionalExpression().size() > 1) {
        } else if (ctx.assignmentExpression() != null && ctx.assignmentExpression().getText().contains("+")) {
            String[] partes = ctx.assignmentExpression().getText().split("\\+");
            if (partes.length >= 2) {
                String esquerda = partes[0].trim();
                String direita = partes[1].trim();
                String temporariaEsquerda = novaTemporaria();
                String temporariaDireita = novaTemporaria();
                String resultado = novaTemporaria();

                codigoLlvm.append("  ").append(temporariaEsquerda).append(" = load i32, i32* %").append(esquerda).append("\n");
                codigoLlvm.append("  ").append(temporariaDireita).append(" = load i32, i32* %").append(direita).append("\n");
                codigoLlvm.append("  ").append(resultado).append(" = add nsw i32 ").append(temporariaEsquerda).append(", ").append(temporariaDireita).append("\n");
            }
        }
        return visitChildren(ctx);
    }


    public void generateFile(String nomeArquivo) {
        try (PrintWriter escritor = new PrintWriter(nomeArquivo)) {
            escritor.write(codigoLlvm.toString());
            System.out.println("Código LLVM IR salvo em " + nomeArquivo);
        } catch (IOException e) {
            System.err.println("Erro ao salvar código LLVM IR: " + e.getMessage());
        }
    }

    public String getIRCode() {
        return codigoLlvm.toString();
    }
}