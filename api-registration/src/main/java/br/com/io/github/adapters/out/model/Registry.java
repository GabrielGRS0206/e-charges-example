package br.com.io.github.adapters.out.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Registry {

    private String chargeId;
    private String name;
    private String document;
    private String dateBirth;
    private String email;
    private String phone;
    private Address address;
    private CardData cardData;
}
