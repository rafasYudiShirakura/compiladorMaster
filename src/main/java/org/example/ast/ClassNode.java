package org.example.ast;

public class ClassNode extends ASTNode {
    private String className;
    
    public ClassNode(String className) {
        super("CLASS");
        this.className = className;
        this.value = className;
    }
    
    public String getClassName() {
        return className;
    }
    
    @Override
    public String toString() {
        return "Class: " + className;
    }
}