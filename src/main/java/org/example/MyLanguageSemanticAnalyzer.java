package org.example;

// Import the generated base listener and parser classes
import org.example.ObjectOrientedParserBaseListener;
import org.example.ObjectOrientedParser;

public class MyLanguageSemanticAnalyzer extends ObjectOrientedParserBaseListener {

    @Override
    public void enterClassDeclaration(ObjectOrientedParser.ClassDeclarationContext ctx) {
        String className = ctx.IDENTIFIER().getText();
        System.out.println("Entering class: " + className);
        // 1. Create a new scope for this class in your symbol table.
        // 2. Add the class itself to the current scope.
    }

    @Override
    public void exitClassDeclaration(ObjectOrientedParser.ClassDeclarationContext ctx) {
        String className = ctx.IDENTIFIER().getText();
        System.out.println("Exiting class: " + className);
        // 1. Pop the class scope from your symbol table stack.
    }

    @Override
    public void enterFieldDeclaration(ObjectOrientedParser.FieldDeclarationContext ctx) {
        String type = ctx.type().getText();

        // Loop through all variables declared on the same line
        for (ObjectOrientedParser.VariableDeclaratorContext varCtx : ctx.variableDeclaratorList().variableDeclarator()) {
            String varName = varCtx.IDENTIFIER().getText();
            System.out.println("  Found field: " + type + " " + varName);

            // Check for an initializer
            if (varCtx.variableInitializer() != null) {
                String value = varCtx.variableInitializer().getText();
                System.out.println("    - with initial value: " + value);
            }
        }
    }

    @Override
    public void enterMethodDeclaration(ObjectOrientedParser.MethodDeclarationContext ctx) {
        String methodName = ctx.IDENTIFIER().getText();
        System.out.println("  Entering method: " + methodName);
        // 1. Create a new scope for this method.
        // 2. Add method parameters to this new scope.
    }

    @Override
    public void exitMethodDeclaration(ObjectOrientedParser.MethodDeclarationContext ctx) {
        String methodName = ctx.IDENTIFIER().getText();
        System.out.println("  Exiting method: " + methodName);
        // 1. Pop the method scope.
    }

    /**
     * Listener for an addition expression. This is triggered when the walker
     * exits an additiveExpression rule in the parser that involves an ADD operator.
     */
    @Override
    public void exitAdditiveExpression(ObjectOrientedParser.AdditiveExpressionContext ctx) {
        // Check if this expression is an addition or subtraction
        if (ctx.ADD() != null) {
            // This rule is structured as 'multiplicativeExpression (ADD multiplicativeExpression)*'
            // We can get the left and right operands like this:
            String leftOperand = ctx.multiplicativeExpression(0).getText();
            String rightOperand = ctx.multiplicativeExpression(1).getText();

            System.out.println("  Detected addition: " + leftOperand + " + " + rightOperand);

            // In a real compiler, you would perform type checking here
            // to ensure both operands are numeric.
        }
        // You could add a similar check for subtraction (ctx.SUB() != null)
    }
}