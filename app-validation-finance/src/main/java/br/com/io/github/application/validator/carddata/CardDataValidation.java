package br.com.io.github.application.validator.carddata;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CardDataValidation {
    private String number;
    private String cvv;
    private String validate;
    private String name;
}
