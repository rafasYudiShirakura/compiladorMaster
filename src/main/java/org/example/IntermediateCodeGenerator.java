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

    private final StringBuilder llvmIr = new StringBuilder();
    private int labelCounter = 0;
    private int tempVarCounter = 0;
    private final Map<String, String> symbolTable = new HashMap<>();

    private String newLabel() {
        return "L" + (labelCounter++);
    }

    private String newTemp() {
        return "%t" + (tempVarCounter++);
    }

    private String toLLVMType(String type) {
        switch (type) {
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
                if (type.endsWith("]")) {
                    String baseType = type.substring(0, type.indexOf('['));
                    String llvmBaseType = toLLVMType(baseType);
                    String size = type.substring(type.indexOf('[') + 1, type.indexOf(']'));
                    return "[" + size + " x " + llvmBaseType + "]";
                }
                return "i32"; // Tipo padrão
        }
    }

    @Override
    public Void visitClassDeclaration(ObjectOrientedParser.ClassDeclarationContext ctx) {
        String className = ctx.IDENTIFIER().getText();
        llvmIr.append("; ModuleID = '").append(className).append("'\n");
        llvmIr.append("source_filename = \"").append(className).append(".cid\"\n\n");
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitFieldDeclaration(ObjectOrientedParser.FieldDeclarationContext ctx) {
        String type = ctx.type().getText();
        String llvmType = toLLVMType(type);

        for (ObjectOrientedParser.VariableDeclaratorContext varCtx : ctx.variableDeclaratorList().variableDeclarator()) {
            String varName = varCtx.IDENTIFIER().getText();
            symbolTable.put(varName, type);

            if (varCtx.LBRACK().size() > 0) {
                llvmIr.append("@").append(varName).append(" = common global [10 x ").append(llvmType).append("] zeroinitializer, align 16\n");
            } else {
                llvmIr.append("@").append(varName).append(" = common global ").append(llvmType).append(" 0, align 4\n");
            }
        }
        return null;
    }

    @Override
    public Void visitMethodDeclaration(ObjectOrientedParser.MethodDeclarationContext ctx) {
        String methodName = ctx.IDENTIFIER().getText();
        String returnType = ctx.typeOrVoid().getText();
        String llvmReturnType = toLLVMType(returnType);

        StringBuilder params = new StringBuilder();
        if (ctx.formalParameterList() != null) {
            boolean first = true;
            if (ctx.formalParameterList().formalParameter() != null) {
                for (var param : ctx.formalParameterList().formalParameter()) {
                    if (!first) {
                        params.append(", ");
                    }
                    String paramType = param.type().getText();
                    String paramName = param.variableDeclaratorId().getText();
                    String llvmParamType = toLLVMType(paramType);
                    params.append(llvmParamType).append(" %").append(paramName);
                    symbolTable.put(paramName, paramType);
                    first = false;
                }
            }
        }

        llvmIr.append("\ndefine ").append(llvmReturnType).append(" @").append(methodName).append("(").append(params.toString()).append(") #0 {\n");

        visit(ctx.block());

        if (llvmReturnType.equals("void")) {
            llvmIr.append("  ret void\n");
        } else if (!llvmIr.toString().endsWith("ret i32 0\n")) {
            llvmIr.append("  ret ").append(llvmReturnType).append(" 0\n");
        }

        llvmIr.append("}\n");
        symbolTable.clear();
        return null;
    }

    @Override
    public Void visitBlock(ObjectOrientedParser.BlockContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Void visitStatement(ObjectOrientedParser.StatementContext ctx) {
        if (ctx.RETURN() != null && ctx.expression() != null && !ctx.expression().isEmpty()) {
            String value = ctx.expression(0).getText();
            String tempVar = newTemp();

            if (symbolTable.containsKey(value)) {
                String type = symbolTable.get(value);
                String llvmType = toLLVMType(type);
                llvmIr.append("  ").append(tempVar).append(" = load ").append(llvmType).append(", ").append(llvmType).append("* %").append(value).append(", align 4\n");
                llvmIr.append("  ret ").append(llvmType).append(" ").append(tempVar).append("\n");
            } else {
                String llvmType = toLLVMType("inteiro");
                if(value.contains(".")) llvmType = toLLVMType("real");
                llvmIr.append("  ret ").append(llvmType).append(" ").append(value).append("\n");
            }

        } else if (ctx.IF() != null) {
            String condVar = newTemp();
            String thenLabel = newLabel();
            String elseLabel = newLabel();
            String endLabel = newLabel();

            visit(ctx.parExpression().expression());
            String lastTemp = "%t" + (tempVarCounter - 1);

            llvmIr.append("  ").append(condVar).append(" = icmp ne i32 ").append(lastTemp).append(", 0\n");
            llvmIr.append("  br i1 ").append(condVar).append(", label %").append(thenLabel).append(", label %").append(elseLabel).append("\n");

            // Bloco 'then'
            llvmIr.append(thenLabel).append(":\n");
            visit(ctx.statement(0));
            llvmIr.append("  br label %").append(endLabel).append("\n");

            // Bloco 'else'
            llvmIr.append(elseLabel).append(":\n");
            if (ctx.ELSE() != null) {
                visit(ctx.statement(1));
            }
            llvmIr.append("  br label %").append(endLabel).append("\n");

            llvmIr.append(endLabel).append(":\n");
        }

        return visitChildren(ctx);
    }

    @Override
    public Void visitExpression(ObjectOrientedParser.ExpressionContext ctx) {
        if (ctx.assignmentExpression() != null && ctx.assignmentExpression().conditionalExpression().size() > 1) {
        } else if (ctx.assignmentExpression() != null && ctx.assignmentExpression().getText().contains("+")) {
            String[] parts = ctx.assignmentExpression().getText().split("\\+");
            String left = parts[0].trim();
            String right = parts[1].trim();
            String tempLeft = newTemp();
            String tempRight = newTemp();
            String result = newTemp();

            llvmIr.append("  ").append(tempLeft).append(" = load i32, i32* %").append(left).append("\n");
            llvmIr.append("  ").append(tempRight).append(" = load i32, i32* %").append(right).append("\n");
            llvmIr.append("  ").append(result).append(" = add nsw i32 ").append(tempLeft).append(", ").append(tempRight).append("\n");

        }
        return visitChildren(ctx);
    }


    public void generateFile(String fileName) {
        try (PrintWriter writer = new PrintWriter(fileName)) {
            writer.write(llvmIr.toString());
            System.out.println("LLVM IR salvo em " + fileName);
        } catch (IOException e) {
            System.err.println("Erro ao salvar LLVM IR: " + e.getMessage());
        }
    }

    public String getIRCode() {
        return llvmIr.toString();
    }
}