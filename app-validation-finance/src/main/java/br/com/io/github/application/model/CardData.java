package br.com.io.github.application.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CardData {

    private String number;
    private String cvv;
    private String validate;
    private String name;
}
