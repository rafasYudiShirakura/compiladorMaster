package org.example.ast;

import java.util.List;
import java.util.ArrayList;

public abstract class ASTNode {
    protected List<ASTNode> children = new ArrayList<>();
    protected String nodeType;
    protected String value;
    protected int line;
    protected int column;
    
    public ASTNode(String nodeType) {
        this.nodeType = nodeType;
    }
    
    public ASTNode(String nodeType, String value) {
        this.nodeType = nodeType;
        this.value = value;
    }
    
    public void addChild(ASTNode child) {
        if (child != null) {
            children.add(child);
        }
    }
    
    public List<ASTNode> getChildren() {
        return children;
    }
    
    public String getNodeType() {
        return nodeType;
    }
    
    public String getValue() {
        return value;
    }
    
    public void setValue(String value) {
        this.value = value;
    }
    
    public void setPosition(int line, int column) {
        this.line = line;
        this.column = column;
    }
    
    public abstract String toString();
    
    public String toTreeString(int depth) {
        StringBuilder sb = new StringBuilder();
        String indent = "  ".repeat(depth);
        
        sb.append(indent).append("├── ").append(toString()).append("\n");
        
        for (int i = 0; i < children.size(); i++) {
            if (i == children.size() - 1) {
                sb.append(children.get(i).toTreeString(depth + 1));
            } else {
                sb.append(children.get(i).toTreeString(depth + 1));
            }
        }
        
        return sb.toString();
    }
}