package org.example;

// Import the generated base listener
// Ensure your ANTLR output package is correct if it's not org.example
// e.g. import com.yourlanguage.parser.ObjectOrientedParserBaseListener;
// import com.yourlanguage.parser.ObjectOrientedParser;

public class MyLanguageSemanticAnalyzer extends ObjectOrientedParserBaseListener {

    @Override
    public void enterClassDeclaration(ObjectOrientedParser.ClassDeclarationContext ctx) {
        // ctx.IDENTIFIER() gives you the token for the class name
        String className = ctx.IDENTIFIER().getText();
        System.out.println("Entering class: " + className);
        // Here you would typically:
        // 1. Create a new scope for this class in your symbol table.
        // 2. Add the class itself to the current (e.g., package) scope.
    }

    @Override
    public void exitClassDeclaration(ObjectOrientedParser.ClassDeclarationContext ctx) {
        String className = ctx.IDENTIFIER().getText();
        System.out.println("Exiting class: " + className);
        // Here you would typically:
        // 1. Pop the class scope from your symbol table stack.
    }

    @Override
    public void enterMethodDeclaration(ObjectOrientedParser.MethodDeclarationContext ctx) {
        // ctx.IDENTIFIER() gives you the token for the method name
        String methodName = ctx.IDENTIFIER().getText();
        System.out.println("  Entering method: " + methodName);

        // You can also access other parts, e.g., return type
        // ObjectOrientedParser.TypeOrVoidContext returnTypeCtx = ctx.typeOrVoid();
        // String returnType = returnTypeCtx.getText();
        // System.out.println("    Return type: " + returnType);

        // Access parameters:
        // ObjectOrientedParser.FormalParameterListContext paramsCtx = ctx.formalParameterList();
        // if (paramsCtx != null) {
        //     System.out.println("    Parameters:");
        //     for (ObjectOrientedParser.FormalParameterContext paramCtx : paramsCtx.formalParameter()) {
        //         String paramName = paramCtx.variableDeclaratorId().IDENTIFIER().getText();
        //         String paramType = paramCtx.type().getText();
        //         System.out.println("      - " + paramType + " " + paramName);
        //     }
        // }

        // Here you would typically:
        // 1. Create a new scope for this method.
        // 2. Add method parameters to this new scope.
        // 3. Add the method to the current class's symbol table.
    }

    @Override
    public void exitMethodDeclaration(ObjectOrientedParser.MethodDeclarationContext ctx) {
        String methodName = ctx.IDENTIFIER().getText();
        System.out.println("  Exiting method: " + methodName);
        // Here you would typically:
        // 1. Pop the method scope.
        // 2. Perform type checking for the method body (if not done incrementally).
    }

    // You would override other methods like enterFieldDeclaration, enterVariableDeclarator,
    // enterExpression, etc., to build your symbol table, perform type checking, etc.
    // For example, to check an assignment:
    /*
    @Override
    public void exitAssignmentExpression(ObjectOrientedParser.AssignmentExpressionContext ctx) {
        if (ctx.assignmentOperator() != null) { // It's an actual assignment like x = y, not just an expression
            // Get the type of the left-hand side (LHS)
            // ObjectOrientedParser.ConditionalExpressionContext lhsCtx = ctx.conditionalExpression(0);
            // MyType lhsType = evaluateTypeOf(lhsCtx); // You'll need a way to get types

            // Get the type of the right-hand side (RHS)
            // ObjectOrientedParser.ConditionalExpressionContext rhsCtx = ctx.conditionalExpression(1);
            // MyType rhsType = evaluateTypeOf(rhsCtx);

            // System.out.println("Checking assignment: " + lhsCtx.getText() + " " + ctx.assignmentOperator().getText() + " " + rhsCtx.getText());
            // if (!isAssignable(lhsType, rhsType)) {
            //    System.err.println("Type error: Cannot assign " + rhsType + " to " + lhsType + " at line " + ctx.start.getLine());
            // }
        }
    }
    */
}