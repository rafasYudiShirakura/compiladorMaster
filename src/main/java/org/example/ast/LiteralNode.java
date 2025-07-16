package org.example.ast;

public class LiteralNode extends ASTNode {
    private String literalType;
    private String literalValue;
    
    public LiteralNode(String literalType, String literalValue) {
        super("LITERAL");
        this.literalType = literalType;
        this.literalValue = literalValue;
        this.value = literalValue;
    }
    
    public String getLiteralType() {
        return literalType;
    }
    
    public String getLiteralValue() {
        return literalValue;
    }
    
    @Override
    public String toString() {
        return "Literal: " + literalType + " = " + literalValue;
    }
}