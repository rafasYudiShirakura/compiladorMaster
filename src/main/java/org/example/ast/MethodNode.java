package org.example.ast;

public class MethodNode extends ASTNode {
    private String methodName;
    private String returnType;
    private String visibility;
    
    public MethodNode(String methodName, String returnType, String visibility) {
        super("METHOD");
        this.methodName = methodName;
        this.returnType = returnType;
        this.visibility = visibility;
        this.value = methodName;
    }
    
    public String getMethodName() {
        return methodName;
    }
    
    public String getReturnType() {
        return returnType;
    }
    
    public String getVisibility() {
        return visibility;
    }
    
    @Override
    public String toString() {
        return "Method: " + visibility + " " + returnType + " " + methodName + "()";
    }
}