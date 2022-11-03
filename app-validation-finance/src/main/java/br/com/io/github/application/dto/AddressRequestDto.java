package br.com.io.github.application.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AddressRequestDto {

    private String city;
    private String state;
    private String street;
    private String number;
    private String country;
}
