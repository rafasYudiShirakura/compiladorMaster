package org.example;

import org.example.output.generated.ObjectOrientedParser;
import org.example.output.generated.ObjectOrientedParserBaseListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

public class MyLanguageSemanticAnalyzer extends ObjectOrientedParserBaseListener {

    // Tabela de símbolos para controlar escopos
    private Map<String, String> symbolTable = new HashMap<>();
    private List<String> errors = new ArrayList<>();
    private String currentMethodReturnType = null;
    private Set<String> allowedTypes = new HashSet<>(Arrays.asList(
            "frequenciaMHz", "enderecoDeBlocoEmDisco", "tensaoVolts", "taxaTransferenciaGBpsPrecisa",
            "int", "long", "float", "double", "void"
    ));
    private boolean methodHasReturn = false;

    // LLVM IR code builder
    private StringBuilder llvmCode = new StringBuilder();
    private int tempVarCounter = 0;
    private int labelCounter = 0;

    // Tipos suportados
    private static final Set<String> SUPPORTED_TYPES = new HashSet<>(Arrays.asList(
        "int", "float", "double", "char", "string", "frequenciaMHz", "tensaoVolts", "taxaTransferenciaGBpsPrecisa", "codigoPostDisplay"
    ));

    @Override
    public void enterClassDeclaration(ObjectOrientedParser.ClassDeclarationContext ctx) {
        String className = ctx.IDENTIFIER().getText();
        llvmCode.append("; Classe principal: " + className + "\n");
        llvmCode.append("define i32 @main() {\n");
        System.out.println("Entering class: " + className);
        symbolTable.put(className, "CLASS");
    }

    @Override
    public void exitClassDeclaration(ObjectOrientedParser.ClassDeclarationContext ctx) {
        llvmCode.append("  ret i32 0\n}");
        String className = ctx.IDENTIFIER().getText();
        System.out.println("Exiting class: " + className);

        // Mostrar erros encontrados
        if (!errors.isEmpty()) {
            System.out.println("\n=== SEMANTIC ERRORS FOUND ===");
            for (String error : errors) {
                System.err.println("ERROR: " + error);
            }
            System.out.println("==============================");
        } else {
            System.out.println("✓ No semantic errors found in class " + className);
        }
        System.out.println("\n=== LLVM IR GENERATED ===\n" + llvmCode.toString());
    }

    @Override
    public void enterMethodDeclaration(ObjectOrientedParser.MethodDeclarationContext ctx) {
        String methodName = ctx.IDENTIFIER().getText();
        methodHasReturn = false;
        // Capturar o tipo de retorno do método
        if (ctx.typeOrVoid() != null) {
            if (ctx.typeOrVoid().VOID() != null) {
                currentMethodReturnType = "void";
            } else if (ctx.typeOrVoid().type() != null) {
                currentMethodReturnType = ctx.typeOrVoid().type().getText();
                // Verificar se o tipo de retorno é permitido
                if (!allowedTypes.contains(currentMethodReturnType)) {
                    errors.add("Invalid return type for method '" + methodName + "': '" + currentMethodReturnType + "'.");
                }
            }
        }
        // Adicionar parâmetros à tabela de símbolos
        if (ctx.formalParameterList() != null) {
            for (ObjectOrientedParser.FormalParameterContext paramCtx : ctx.formalParameterList().formalParameter()) {
                String paramType = paramCtx.type().getText();
                String paramName = paramCtx.variableDeclaratorId().IDENTIFIER().getText();
                symbolTable.put(paramName, paramType);
            }
        }
        System.out.println("  Entering method: " + methodName + " (returns: " + currentMethodReturnType + ")");
        symbolTable.put(methodName, "METHOD:" + currentMethodReturnType);
    }

    @Override
    public void exitMethodDeclaration(ObjectOrientedParser.MethodDeclarationContext ctx) {
        String methodName = ctx.IDENTIFIER().getText();
        // Remover parâmetros da tabela de símbolos ao sair do método
        if (ctx.formalParameterList() != null) {
            for (ObjectOrientedParser.FormalParameterContext paramCtx : ctx.formalParameterList().formalParameter()) {
                String paramName = paramCtx.variableDeclaratorId().IDENTIFIER().getText();
                symbolTable.remove(paramName);
            }
        }
        // Se o método não é void e não teve return, adicionar erro
        if (currentMethodReturnType != null && !currentMethodReturnType.equals("void") && !methodHasReturn) {
            errors.add("Method '" + methodName + "' with return type '" + currentMethodReturnType + "' must have at least one return statement.");
        }
        System.out.println("  Exiting method: " + methodName);
        currentMethodReturnType = null;
        methodHasReturn = false;
    }

    @Override
    public void enterLocalVariableDeclarationStatement(ObjectOrientedParser.LocalVariableDeclarationStatementContext ctx) {
        if (ctx.type() != null) {
            String type = ctx.type().getText();
            for (ObjectOrientedParser.VariableDeclaratorContext varCtx : ctx.variableDeclaratorList().variableDeclarator()) {
                String varName = varCtx.IDENTIFIER().getText();
                // Geração de código LLVM para declaração de variável
                String llvmType = toLLVMType(type);
                if (ctx.type().LBRACK() != null) {
                    // Vetor
                    llvmCode.append("  %" + varName + " = alloca " + llvmType + ", i32 100\n");
                } else {
                    llvmCode.append("  %" + varName + " = alloca " + llvmType + "\n");
                }
                System.out.println("  Found local variable: " + type + " " + varName);

                // Adicionar à tabela de símbolos
                symbolTable.put(varName, type);

                if (varCtx.variableInitializer() != null) {
                    String value = varCtx.variableInitializer().getText();
                    System.out.println("    - with initial value: " + value);

                    // Verificar compatibilidade de tipos na inicialização
                    checkTypeCompatibility(type, varCtx.variableInitializer(), varName);
                }
            }
        }
    }

    @Override
    public void enterStatement(ObjectOrientedParser.StatementContext ctx) {
        // Estrutura de decisão
        if (ctx.IF() != null) {
            String labelTrue = newLabel();
            String labelEnd = newLabel();
            llvmCode.append("  ; if statement\n");
            llvmCode.append("  br i1 %cond, label %" + labelTrue + ", label %" + labelEnd + "\n");
            llvmCode.append(labelTrue + ":\n");
            // O corpo do if será processado normalmente
            llvmCode.append(labelEnd + ":\n");
        }
        // Estrutura de repetição
        if (ctx.FOR() != null) {
            String labelLoop = newLabel();
            String labelAfter = newLabel();
            llvmCode.append("  ; for loop\n");
            llvmCode.append(labelLoop + ":\n");
            // Corpo do loop será processado normalmente
            llvmCode.append("  br label %" + labelLoop + "\n");
            llvmCode.append(labelAfter + ":\n");
        }
        // Reconhecimento de chamada de função
        if (ctx.expressionStatement() != null && ctx.expressionStatement().getText().contains("(")) {
            String call = ctx.expressionStatement().getText();
            if (call.startsWith("scanf")) {
                llvmCode.append("  ; chamada scanf\n");
            } else if (call.startsWith("printf")) {
                llvmCode.append("  ; chamada printf\n");
            } else {
                llvmCode.append("  ; chamada de função: " + call + "\n");
            }
        }

        // Verificar statements de RETURN
        if (ctx.RETURN() != null) {
            methodHasReturn = true;
            System.out.println("  Found RETURN statement");

            if (currentMethodReturnType != null) {
                if (currentMethodReturnType.equals("void")) {
                    if (ctx.expression() != null) {
                        String returnValue = ctx.expression().get(0).getText();
                        errors.add("Method with void return type cannot return a value: " + returnValue);
                    }
                } else {
                    if (ctx.expression() == null) {
                        errors.add("Method with return type '" + currentMethodReturnType + "' must return a value");
                    } else {
                        String returnValue = ctx.expression().get(0).getText();
                        System.out.println("    - returning: " + returnValue);
                        checkReturnTypeCompatibility(currentMethodReturnType, returnValue);
                    }
                }
            }
        }

        // Verificar outros tipos de statements
        if (ctx.expressionStatement() != null) {
            System.out.println("  Found expression statement: " + ctx.expressionStatement().getText());
        }
    }

    @Override
    public void exitAdditiveExpression(ObjectOrientedParser.AdditiveExpressionContext ctx) {
        // Verificar se há operações de adição ou subtração
        List<TerminalNode> operators = new ArrayList<>();
        operators.addAll(ctx.ADD());
        operators.addAll(ctx.SUB());

        if (!operators.isEmpty()) {
            List<ObjectOrientedParser.MultiplicativeExpressionContext> operands = ctx.multiplicativeExpression();

            for (int i = 0; i < operators.size(); i++) {
                if (i + 1 < operands.size()) {
                    String leftOperand = operands.get(i).getText();
                    String rightOperand = operands.get(i + 1).getText();
                    String operator = operators.get(i).getText();

                    System.out.println("  Detected " + (operator.equals("+") ? "addition" : "subtraction") +
                            ": " + leftOperand + " " + operator + " " + rightOperand);

                    // Verificar se os operandos são compatíveis para operação aritmética
                    checkArithmeticOperands(leftOperand, rightOperand, operator);
                }
            }
        }
    }

    @Override
    public void enterExpression(ObjectOrientedParser.ExpressionContext ctx) {
        System.out.println("  Found expression: " + ctx.getText());
    }

    // Método auxiliar para verificar compatibilidade de tipos
    private void checkTypeCompatibility(String declaredType, ObjectOrientedParser.VariableInitializerContext initCtx, String varName) {
        if (initCtx.expression() != null) {
            String initValue = initCtx.expression().getText();

            // Se for expressão aritmética
            if (initValue.contains("+") || initValue.contains("-") || initValue.contains("*") || initValue.contains("/")) {
                // Se a expressão contém ponto flutuante, não pode atribuir a tipo inteiro
                if (initValue.matches(".*\\d+\\.\\d+.*")) {
                    if (declaredType.equals("frequenciaMHz") || declaredType.equals("int") || declaredType.equals("long") || declaredType.equals("enderecoDeBlocoEmDisco")) {
                        errors.add("Cannot assign floating point expression '" + initValue + "' to integer type '" + declaredType + "' for variable '" + varName + "'");
                    }
                }
            } else if (initValue.matches("\\d+\\.\\d+")) {
                // Literal float
                if (declaredType.equals("frequenciaMHz") || declaredType.equals("int") || declaredType.equals("long") || declaredType.equals("enderecoDeBlocoEmDisco")) {
                    errors.add("Cannot assign floating point literal '" + initValue + "' to integer type '" + declaredType + "' for variable '" + varName + "'");
                }
            } else if (initValue.matches("\\d+")) {
                // Literal inteiro
                if (!isNumericType(declaredType)) {
                    errors.add("Cannot assign numeric literal to non-numeric type '" + declaredType + "' for variable '" + varName + "'");
                }
            }
        }
    }

    // Método auxiliar para verificar compatibilidade de tipos do return
    private void checkReturnTypeCompatibility(String methodReturnType, String returnValue) {
        // Verificar se o valor retornado é compatível com o tipo de retorno do método
        if (returnValue.matches("\\d+")) {
            // Retornando um literal numérico inteiro
            if (!isNumericType(methodReturnType)) {
                errors.add("Cannot return numeric literal from method with return type '" + methodReturnType + "'");
            } else if (isFloatType(methodReturnType)) {
                // ok
            } else if (isIntType(methodReturnType)) {
                // ok
            }
        } else if (returnValue.matches("\\d+\\.\\d+")) {
            // Retornando um literal float
            if (isIntType(methodReturnType)) {
                errors.add("Cannot return floating point literal '" + returnValue + "' from method with integer return type '" + methodReturnType + "'");
            }
        } else if (symbolTable.containsKey(returnValue)) {
            // Retornando uma variável
            String varType = symbolTable.get(returnValue);
            if (!isTypeCompatible(varType, methodReturnType)) {
                errors.add("Cannot return variable of type '" + varType + "' from method with return type '" + methodReturnType + "'");
            } else if (isFloatType(varType) && isIntType(methodReturnType)) {
                errors.add("Cannot return variable of float type '" + varType + "' from method with integer return type '" + methodReturnType + "'");
            }
        } else if (returnValue.matches(".*\\d+\\.\\d+.*")) {
            // Expressão com float
            if (isIntType(methodReturnType)) {
                errors.add("Cannot return floating point expression '" + returnValue + "' from method with integer return type '" + methodReturnType + "'");
            }
        } else {
            // Valor não reconhecido - pode ser uma expressão complexa
            System.out.println("    - Warning: Could not verify return type compatibility for complex expression: " + returnValue);
        }
    }

    // Método auxiliar para verificar operandos aritméticos
    private void checkArithmeticOperands(String left, String right, String operator) {
        // Verificar se os operandos são válidos para operação aritmética
        if (!isValidArithmeticOperand(left)) {
            errors.add("Invalid left operand for arithmetic operation: " + left);
        }
        if (!isValidArithmeticOperand(right)) {
            errors.add("Invalid right operand for arithmetic operation: " + right);
        }
    }

    // Método auxiliar para verificar se um tipo é numérico
    private boolean isNumericType(String type) {
        return type.equals("frequenciaMHz") || type.equals("enderecoDeBlocoEmDisco") ||
                type.equals("tensaoVolts") || type.equals("taxaTransferenciaGBpsPrecisa") ||
                type.equals("int") || type.equals("long") || type.equals("float") || type.equals("double");
    }

    // Método auxiliar para verificar compatibilidade entre tipos
    private boolean isTypeCompatible(String fromType, String toType) {
        if (fromType.equals(toType)) {
            return true;
        }

        // Verificar conversões numéricas válidas
        if (isNumericType(fromType) && isNumericType(toType)) {
            return true;
        }

        return false;
    }

    // Método auxiliar para verificar se um operando é válido para operação aritmética
    private boolean isValidArithmeticOperand(String operand) {
        // Verificar se é um literal numérico
        if (operand.matches("\\d+") || operand.matches("\\d+\\.\\d+")) {
            return true;
        }

        // Verificar se é uma variável declarada com tipo numérico
        if (symbolTable.containsKey(operand)) {
            String type = symbolTable.get(operand);
            return isNumericType(type);
        }

        return false;
    }

    // Método para obter todos os erros encontrados
    public List<String> getErrors() {
        return new ArrayList<>(errors);
    }

    // Método para verificar se há erros
    public boolean hasErrors() {
        return !errors.isEmpty();
    }

    private boolean isFloatType(String type) {
        return type.equals("tensaoVolts") || type.equals("taxaTransferenciaGBpsPrecisa") || type.equals("float") || type.equals("double");
    }

    private boolean isIntType(String type) {
        return type.equals("frequenciaMHz") || type.equals("enderecoDeBlocoEmDisco") || type.equals("int") || type.equals("long");
    }

    // Utilitário para tipos LLVM
    private String toLLVMType(String type) {
        switch (type) {
            case "int":
            case "frequenciaMHz":
            case "enderecoDeBlocoEmDisco":
                return "i32";
            case "float":
            case "tensaoVolts":
                return "float";
            case "double":
            case "taxaTransferenciaGBpsPrecisa":
                return "double";
            case "char":
            case "codigoPostDisplay":
                return "i8";
            case "string":
                return "i8*";
            default:
                return "i32";
        }
    }
    private String newTemp() {
        return "%t" + (tempVarCounter++);
    }
    private String newLabel() {
        return "L" + (labelCounter++);
    }
}

