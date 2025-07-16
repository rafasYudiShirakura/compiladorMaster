package org.example.ast;

public class ParameterNode extends ASTNode {
    private String parameterName;
    private String parameterType;
    
    public ParameterNode(String parameterName, String parameterType) {
        super("PARAMETER");
        this.parameterName = parameterName;
        this.parameterType = parameterType;
        this.value = parameterName;
    }
    
    public String getParameterName() {
        return parameterName;
    }
    
    public String getParameterType() {
        return parameterType;
    }
    
    @Override
    public String toString() {
        return "Parameter: " + parameterType + " " + parameterName;
    }
}