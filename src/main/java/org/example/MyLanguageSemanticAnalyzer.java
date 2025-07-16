package org.example;

import org.example.output.generated.ObjectOrientedParser;
import org.example.output.generated.ObjectOrientedParserBaseListener;

import java.util.*;

public class MyLanguageSemanticAnalyzer extends ObjectOrientedParserBaseListener {

    private Map<String, String> symbolTable = new HashMap<>();
    private List<String> errors = new ArrayList<>();
    private String currentMethodReturnType = null;
    private Set<String> allowedTypes = new HashSet<>(Arrays.asList(
            "frequenciaMHz", "enderecoDeBlocoEmDisco", "tensaoVolts", "taxaTransferenciaGBpsPrecisa",
            "estadoEnergia", "codigoPostDisplay", "string",
            "int", "long", "float", "double", "boolean", "char", "void", 
            "inteiro", "real", "caractere", "texto"
    ));
    
    private Set<String> predefinedFunctions = new HashSet<>(Arrays.asList(
            "mostrarDisplay", "lerEntradaSensor", "printf", "scanf", "print", "read"
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
        
        if (ctx.getText().contains("paraCadaPinoNoConector")) {
            System.out.println("  Found FOR loop structure");
            validateForLoop(ctx);
        }
        
        if (ctx.getText().contains("enquantoConexaoAtiva")) {
            System.out.println("  Found WHILE loop structure");
            validateWhileLoop(ctx);
        }
        
        if (ctx.getText().contains("mostrarDisplay") || ctx.getText().contains("lerEntradaSensor")) {
            System.out.println("  Found I/O function call");
            validateIOFunction(ctx);
        }
        
        if (ctx.expressionStatement() != null && 
            ctx.expressionStatement().expression() != null) {
            validateMethodCalls(ctx.expressionStatement().expression());
        }
    }
    
    private void validateForLoop(ObjectOrientedParser.StatementContext ctx) {
        System.out.println("    Validating FOR loop semantics");
    }
    
    private void validateWhileLoop(ObjectOrientedParser.StatementContext ctx) {
        System.out.println("    Validating WHILE loop semantics");
    }
    
    private void validateIOFunction(ObjectOrientedParser.StatementContext ctx) {
        System.out.println("    Validating I/O function call");
        String statement = ctx.getText();
        if (statement.contains("mostrarDisplay")) {
            System.out.println("      Found output function: mostrarDisplay");
        }
        if (statement.contains("lerEntradaSensor")) {
            System.out.println("      Found input function: lerEntradaSensor");
        }
    }
    
    private void validateMethodCalls(ObjectOrientedParser.ExpressionContext expr) {
        String exprText = expr.getText();
        
        for (String methodName : symbolTable.keySet()) {
            if (symbolTable.get(methodName).startsWith("METHOD:") && 
                exprText.contains(methodName + "(")) {
                System.out.println("  Found method call: " + methodName);
                validateMethodCall(methodName, expr);
            }
        }
        
        for (String predefinedFunc : predefinedFunctions) {
            if (exprText.contains(predefinedFunc + "(")) {
                System.out.println("  Found predefined function call: " + predefinedFunc);
            }
        }
    }
    
    private void validateMethodCall(String methodName, ObjectOrientedParser.ExpressionContext expr) {
        String methodSignature = symbolTable.get(methodName);
        if (methodSignature != null && methodSignature.startsWith("METHOD:")) {
            String returnType = methodSignature.substring(7);
            System.out.println("    Method '" + methodName + "' returns: " + returnType);
        }
    }

    private void checkTypeCompatibility(String declaredType, ObjectOrientedParser.VariableInitializerContext initCtx, String varName) {
        if (initCtx.expression() != null) {
            String expressionType = getExpressionType(initCtx.expression());
            if (!isTypeCompatible(declaredType, expressionType)) {
                errors.add("Type mismatch for variable '" + varName + "': cannot convert from '" + 
                          expressionType + "' to '" + declaredType + "'");
            }
        } else if (initCtx.arrayInitializer() != null) {
            if (!declaredType.endsWith("[]")) {
                errors.add("Cannot assign array initializer to non-array variable '" + varName + "'");
            } else {
                String elementType = declaredType.substring(0, declaredType.length() - 2);
                checkArrayInitializerCompatibility(elementType, initCtx.arrayInitializer(), varName);
            }
        }
    }

    private String getExpressionType(ObjectOrientedParser.ExpressionContext exprCtx) {
        if (exprCtx.assignmentExpression() != null) {
            return getAssignmentExpressionType(exprCtx.assignmentExpression());
        }
        return "unknown";
    }

    private String getAssignmentExpressionType(ObjectOrientedParser.AssignmentExpressionContext ctx) {
        if (ctx.conditionalExpression() != null && !ctx.conditionalExpression().isEmpty()) {
            return getConditionalExpressionType(ctx.conditionalExpression(0));
        }
        return "unknown";
    }

    private String getConditionalExpressionType(ObjectOrientedParser.ConditionalExpressionContext ctx) {
        if (ctx.conditionalOrExpression() != null) {
            return getConditionalOrExpressionType(ctx.conditionalOrExpression());
        }
        return "unknown";
    }

    private String getConditionalOrExpressionType(ObjectOrientedParser.ConditionalOrExpressionContext ctx) {
        if (ctx.conditionalAndExpression() != null && !ctx.conditionalAndExpression().isEmpty()) {
            return getConditionalAndExpressionType(ctx.conditionalAndExpression(0));
        }
        return "unknown";
    }

    private String getConditionalAndExpressionType(ObjectOrientedParser.ConditionalAndExpressionContext ctx) {
        if (ctx.inclusiveOrExpression() != null && !ctx.inclusiveOrExpression().isEmpty()) {
            return getInclusiveOrExpressionType(ctx.inclusiveOrExpression(0));
        }
        return "unknown";
    }

    private String getInclusiveOrExpressionType(ObjectOrientedParser.InclusiveOrExpressionContext ctx) {
        if (ctx.exclusiveOrExpression() != null && !ctx.exclusiveOrExpression().isEmpty()) {
            return getExclusiveOrExpressionType(ctx.exclusiveOrExpression(0));
        }
        return "unknown";
    }

    private String getExclusiveOrExpressionType(ObjectOrientedParser.ExclusiveOrExpressionContext ctx) {
        if (ctx.andExpression() != null && !ctx.andExpression().isEmpty()) {
            return getAndExpressionType(ctx.andExpression(0));
        }
        return "unknown";
    }

    private String getAndExpressionType(ObjectOrientedParser.AndExpressionContext ctx) {
        if (ctx.equalityExpression() != null && !ctx.equalityExpression().isEmpty()) {
            return getEqualityExpressionType(ctx.equalityExpression(0));
        }
        return "unknown";
    }

    private String getEqualityExpressionType(ObjectOrientedParser.EqualityExpressionContext ctx) {
        if (ctx.relationalExpression() != null && !ctx.relationalExpression().isEmpty()) {
            return getRelationalExpressionType(ctx.relationalExpression(0));
        }
        return "unknown";
    }

    private String getRelationalExpressionType(ObjectOrientedParser.RelationalExpressionContext ctx) {
        if (ctx.shiftExpression() != null && !ctx.shiftExpression().isEmpty()) {
            return getShiftExpressionType(ctx.shiftExpression(0));
        }
        return "unknown";
    }

    private String getShiftExpressionType(ObjectOrientedParser.ShiftExpressionContext ctx) {
        if (ctx.additiveExpression() != null && !ctx.additiveExpression().isEmpty()) {
            return getAdditiveExpressionType(ctx.additiveExpression(0));
        }
        return "unknown";
    }

    private String getAdditiveExpressionType(ObjectOrientedParser.AdditiveExpressionContext ctx) {
        if (ctx.multiplicativeExpression() != null && !ctx.multiplicativeExpression().isEmpty()) {
            return getMultiplicativeExpressionType(ctx.multiplicativeExpression(0));
        }
        return "unknown";
    }

    private String getMultiplicativeExpressionType(ObjectOrientedParser.MultiplicativeExpressionContext ctx) {
        if (ctx.unaryExpression() != null && !ctx.unaryExpression().isEmpty()) {
            return getUnaryExpressionType(ctx.unaryExpression(0));
        }
        return "unknown";
    }

    private String getUnaryExpressionType(ObjectOrientedParser.UnaryExpressionContext ctx) {
        if (ctx.unaryExpressionNotPlusMinus() != null) {
            return getUnaryExpressionNotPlusMinusType(ctx.unaryExpressionNotPlusMinus());
        } else if (ctx.preIncrementExpression() != null) {
            return getUnaryExpressionType(ctx.preIncrementExpression().unaryExpression());
        } else if (ctx.preDecrementExpression() != null) {
            return getUnaryExpressionType(ctx.preDecrementExpression().unaryExpression());
        } else if (ctx.unaryExpression() != null) {
            return getUnaryExpressionType(ctx.unaryExpression());
        }
        return "unknown";
    }

    private String getUnaryExpressionNotPlusMinusType(ObjectOrientedParser.UnaryExpressionNotPlusMinusContext ctx) {
        if (ctx.postfixExpression() != null) {
            return getPostfixExpressionType(ctx.postfixExpression());
        } else if (ctx.castExpression() != null) {
            return "unknown";
        }
        return "unknown";
    }

    private String getPostfixExpressionType(ObjectOrientedParser.PostfixExpressionContext ctx) {
        if (ctx.primary() != null) {
            return getPrimaryExpressionType(ctx.primary());
        }
        return "unknown";
    }

    private String getPrimaryExpressionType(ObjectOrientedParser.PrimaryContext primaryCtx) {
        if (primaryCtx == null) return "unknown";
        
        if (primaryCtx.literal() != null) {
            return getLiteralType(primaryCtx.literal());
        } else if (primaryCtx.IDENTIFIER() != null) {
            String varName = primaryCtx.IDENTIFIER().getText();
            return symbolTable.getOrDefault(varName, "unknown");
        } else if (primaryCtx.THIS() != null) {
            return "this";
        } else if (primaryCtx.getText().equals("null")) {
            return "null";
        }
        return "unknown";
    }

    private String getLiteralType(ObjectOrientedParser.LiteralContext literalCtx) {
        if (literalCtx.INTEGER_LITERAL() != null) {
            return "frequenciaMHz";
        } else if (literalCtx.FLOAT_LITERAL() != null) {
            return "tensaoVolts";
        } else if (literalCtx.CHAR_LITERAL() != null) {
            return "codigoPostDisplay";
        } else if (literalCtx.STRING_LITERAL() != null) {
            return "string";
        } else if (literalCtx.BOOLEAN_LITERAL() != null) {
            return "estadoEnergia";
        }
        return "unknown";
    }

    private boolean isTypeCompatible(String declaredType, String expressionType) {
        if (declaredType.equals(expressionType)) {
            return true;
        }
        
        if ("null".equals(expressionType) && !isPrimitiveType(declaredType)) {
            return true;
        }
        
        if (isNumericType(declaredType) && isNumericType(expressionType)) {
            return isValidNumericConversion(expressionType, declaredType);
        }
        
        return false;
    }

    private boolean isPrimitiveType(String type) {
        return Arrays.asList("frequenciaMHz", "enderecoDeBlocoEmDisco", "tensaoVolts", 
                            "taxaTransferenciaGBpsPrecisa", "estadoEnergia", "codigoPostDisplay",
                            "int", "long", "float", "double", "boolean", "char",
                            "inteiro", "real", "caractere").contains(type);
    }

    private boolean isNumericType(String type) {
        return Arrays.asList("frequenciaMHz", "enderecoDeBlocoEmDisco", "tensaoVolts", 
                            "taxaTransferenciaGBpsPrecisa", "int", "long", "float", "double",
                            "inteiro", "real").contains(type);
    }

    private boolean isValidNumericConversion(String fromType, String toType) {
        if (fromType.equals("frequenciaMHz") || fromType.equals("int") || fromType.equals("inteiro")) {
            return Arrays.asList("frequenciaMHz", "enderecoDeBlocoEmDisco", "tensaoVolts", 
                                "taxaTransferenciaGBpsPrecisa", "int", "long", "float", "double",
                                "inteiro", "real").contains(toType);
        }
        if (fromType.equals("enderecoDeBlocoEmDisco") || fromType.equals("long")) {
            return Arrays.asList("enderecoDeBlocoEmDisco", "tensaoVolts", "taxaTransferenciaGBpsPrecisa",
                                "long", "float", "double", "real").contains(toType);
        }
        if (fromType.equals("tensaoVolts") || fromType.equals("float") || fromType.equals("real")) {
            return Arrays.asList("tensaoVolts", "taxaTransferenciaGBpsPrecisa", "float", "double", "real").contains(toType);
        }
        if (fromType.equals("taxaTransferenciaGBpsPrecisa") || fromType.equals("double")) {
            return Arrays.asList("taxaTransferenciaGBpsPrecisa", "double").contains(toType);
        }
        return false;
    }

    private void checkArrayInitializerCompatibility(String elementType, ObjectOrientedParser.ArrayInitializerContext arrayCtx, String varName) {
        if (arrayCtx.variableInitializer() != null) {
            for (ObjectOrientedParser.VariableInitializerContext initCtx : arrayCtx.variableInitializer()) {
                checkTypeCompatibility(elementType, initCtx, varName + "[]");
            }
        }
    }

    public List<String> getErrors() {
        return new ArrayList<>(errors);
    }

    public boolean hasErrors() {
        return !errors.isEmpty();
    }
}