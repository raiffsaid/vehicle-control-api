package com.raiffsaid.vehiclecontrol.resources.exceptions;

import java.io.Serializable;

public class FieldMessage implements Serializable {

    private String fieldName;
    private String message;

    public FieldMessage() {
    }

    public FieldMessage(String fieldName, String message) {
        this.fieldName = fieldName;
        this.message = message;
    }

    public String getFieldName() {
        return fieldName;
    }

    public String getMessage() {
        return message;
    }
}
