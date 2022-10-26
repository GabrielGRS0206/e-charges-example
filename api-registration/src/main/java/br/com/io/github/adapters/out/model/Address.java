package br.com.io.github.adapters.out.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Address {

    private String city;
    private String state;
    private String street;
    private String number;
    private String country;
}
