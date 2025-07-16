package org.example.ast;

public class ExpressionNode extends ASTNode {
    private String expressionType;
    private String operator;
    
    public ExpressionNode(String expressionType) {
        super("EXPRESSION");
        this.expressionType = expressionType;
        this.value = expressionType;
    }
    
    public ExpressionNode(String expressionType, String operator) {
        super("EXPRESSION");
        this.expressionType = expressionType;
        this.operator = operator;
        this.value = operator != null ? operator : expressionType;
    }
    
    public String getExpressionType() {
        return expressionType;
    }
    
    public String getOperator() {
        return operator;
    }
    
    @Override
    public String toString() {
        if (operator != null) {
            return "Expression: " + expressionType + " [" + operator + "]";
        } else {
            return "Expression: " + expressionType;
        }
    }
}