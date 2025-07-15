package org.example;

import org.example.output.generated.ObjectOrientedParser;
import org.example.output.generated.ObjectOrientedParserBaseListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

public class MyLanguageSemanticAnalyzer extends ObjectOrientedParserBaseListener {

    private Map<String, String> symbolTable = new HashMap<>();
    private List<String> errors = new ArrayList<>();
    private String currentMethodReturnType = null;
    private Set<String> allowedTypes = new HashSet<>(Arrays.asList(
            "frequenciaMHz", "enderecoDeBlocoEmDisco", "tensaoVolts", "taxaTransferenciaGBpsPrecisa",
            "int", "long", "float", "double", "void", "inteiro", "real", "caractere", "texto"
    ));
    private boolean methodHasReturn = false;

    private StringBuilder llvmCode = new StringBuilder();

    private static final Set<String> SUPPORTED_TYPES = new HashSet<>(Arrays.asList(
            "int", "float", "double", "char", "string", "frequenciaMHz", "tensaoVolts", "taxaTransferenciaGBpsPrecisa", "codigoPostDisplay", "inteiro", "real", "caractere", "texto"
    ));

    @Override
    public void enterClassDeclaration(ObjectOrientedParser.ClassDeclarationContext ctx) {
        String className = ctx.IDENTIFIER().getText();
        System.out.println("Entering class: " + className);
        symbolTable.put(className, "CLASS");
    }

    @Override
    public void exitClassDeclaration(ObjectOrientedParser.ClassDeclarationContext ctx) {
        String className = ctx.IDENTIFIER().getText();
        System.out.println("Exiting class: " + className);

        if (!errors.isEmpty()) {
            System.out.println("\n=== SEMANTIC ERRORS FOUND ===");
            for (String error : errors) {
                System.err.println("ERROR: " + error);
            }
            System.out.println("==============================");
        } else {
            System.out.println("✓ No semantic errors found in class " + className);
        }
    }

    @Override
    public void enterMethodDeclaration(ObjectOrientedParser.MethodDeclarationContext ctx) {
        String methodName = ctx.IDENTIFIER().getText();
        methodHasReturn = false;

        if (ctx.typeOrVoid() != null) {
            if (ctx.typeOrVoid().VOID() != null) {
                currentMethodReturnType = "void";
            } else if (ctx.typeOrVoid().type() != null) {
                currentMethodReturnType = ctx.typeOrVoid().type().getText();
                if (!allowedTypes.contains(currentMethodReturnType)) {
                    errors.add("Invalid return type for method '" + methodName + "': '" + currentMethodReturnType + "'.");
                }
            }
        }

        if (ctx.formalParameterList() != null) {
            if (ctx.formalParameterList().formalParameter() != null){
                for (ObjectOrientedParser.FormalParameterContext paramCtx : ctx.formalParameterList().formalParameter()) {
                    String paramType = paramCtx.type().getText();
                    String paramName = paramCtx.variableDeclaratorId().IDENTIFIER().getText();
                    symbolTable.put(paramName, paramType);
                }
            }
        }
        System.out.println("  Entering method: " + methodName + " (returns: " + currentMethodReturnType + ")");
        symbolTable.put(methodName, "METHOD:" + currentMethodReturnType);
    }

    @Override
    public void exitMethodDeclaration(ObjectOrientedParser.MethodDeclarationContext ctx) {
        String methodName = ctx.IDENTIFIER().getText();
        if (ctx.formalParameterList() != null) {
            if (ctx.formalParameterList().formalParameter() != null){
                for (ObjectOrientedParser.FormalParameterContext paramCtx : ctx.formalParameterList().formalParameter()) {
                    String paramName = paramCtx.variableDeclaratorId().IDENTIFIER().getText();
                    symbolTable.remove(paramName);
                }
            }
        }

        if (currentMethodReturnType != null && !currentMethodReturnType.equals("void") && !methodHasReturn) {
            errors.add("Method '" + methodName + "' with return type '" + currentMethodReturnType + "' must have at least one return statement.");
        }
        System.out.println("  Exiting method: " + methodName);
        currentMethodReturnType = null;
        methodHasReturn = false;
    }

    @Override
    public void enterFieldDeclaration(ObjectOrientedParser.FieldDeclarationContext ctx) {
        String type = ctx.type().getText();
        if(!SUPPORTED_TYPES.contains(type) && !type.endsWith("[]")){
            errors.add("Unsupported type: " + type);
        }
        for (ObjectOrientedParser.VariableDeclaratorContext varCtx : ctx.variableDeclaratorList().variableDeclarator()) {
            String varName = varCtx.IDENTIFIER().getText();
            System.out.println("  Found field: " + type + " " + varName);
            symbolTable.put(varName, type);
            if (varCtx.variableInitializer() != null) {
                String value = varCtx.variableInitializer().getText();
                System.out.println("    - with initial value: " + value);
                checkTypeCompatibility(type, varCtx.variableInitializer(), varName);
            }
        }
    }

    @Override
    public void enterLocalVariableDeclarationStatement(ObjectOrientedParser.LocalVariableDeclarationStatementContext ctx) {
        if (ctx.type() != null) {
            String type = ctx.type().getText();
            if(!SUPPORTED_TYPES.contains(type) && !type.endsWith("[]")){
                errors.add("Unsupported type: " + type);
            }
            for (ObjectOrientedParser.VariableDeclaratorContext varCtx : ctx.variableDeclaratorList().variableDeclarator()) {
                String varName = varCtx.IDENTIFIER().getText();
                System.out.println("  Found local variable: " + type + " " + varName);
                symbolTable.put(varName, type);

                if (varCtx.variableInitializer() != null) {
                    String value = varCtx.variableInitializer().getText();
                    System.out.println("    - with initial value: " + value);
                    checkTypeCompatibility(type, varCtx.variableInitializer(), varName);
                }
            }
        }
    }

    @Override
    public void enterStatement(ObjectOrientedParser.StatementContext ctx) {
        if (ctx.RETURN() != null) {
            methodHasReturn = true;
        }
    }

    private void checkTypeCompatibility(String declaredType, ObjectOrientedParser.VariableInitializerContext initCtx, String varName) {
        // Implementar a lógica de verificação de tipos aqui
    }

    public List<String> getErrors() {
        return new ArrayList<>(errors);
    }

    public boolean hasErrors() {
        return !errors.isEmpty();
    }
}