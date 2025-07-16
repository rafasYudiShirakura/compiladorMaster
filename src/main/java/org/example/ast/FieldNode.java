package org.example.ast;

public class FieldNode extends ASTNode {
    private String fieldName;
    private String fieldType;
    private String initialValue;
    
    public FieldNode(String fieldName, String fieldType) {
        super("FIELD");
        this.fieldName = fieldName;
        this.fieldType = fieldType;
        this.value = fieldName;
    }
    
    public FieldNode(String fieldName, String fieldType, String initialValue) {
        super("FIELD");
        this.fieldName = fieldName;
        this.fieldType = fieldType;
        this.initialValue = initialValue;
        this.value = fieldName;
    }
    
    public String getFieldName() {
        return fieldName;
    }
    
    public String getFieldType() {
        return fieldType;
    }
    
    public String getInitialValue() {
        return initialValue;
    }
    
    @Override
    public String toString() {
        if (initialValue != null) {
            return "Field: " + fieldType + " " + fieldName + " = " + initialValue;
        } else {
            return "Field: " + fieldType + " " + fieldName;
        }
    }
}