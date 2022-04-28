package br.com.softpethouse.api.commom.validation;

import lombok.Data;

@Data
public class FieldError {
    private String field;
    private String message;

    public FieldError(String field, String message) {
        this.field = field;
        this.message = message;
    }

}
