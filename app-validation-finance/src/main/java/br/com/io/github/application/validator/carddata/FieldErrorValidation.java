package br.com.io.github.application.validator.carddata;

import lombok.Data;

@Data
public class FieldErrorValidation {
    private String message;
    private String field;
}
