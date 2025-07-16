package org.example.ast;

public class StatementNode extends ASTNode {
    private String statementType;
    
    public StatementNode(String statementType) {
        super("STATEMENT");
        this.statementType = statementType;
        this.value = statementType;
    }
    
    public StatementNode(String statementType, String content) {
        super("STATEMENT");
        this.statementType = statementType;
        this.value = content;
    }
    
    public String getStatementType() {
        return statementType;
    }
    
    @Override
    public String toString() {
        return "Statement: " + statementType + (value != null && !value.equals(statementType) ? " (" + value + ")" : "");
    }
}