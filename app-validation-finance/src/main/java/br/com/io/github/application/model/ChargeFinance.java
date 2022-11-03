package br.com.io.github.application.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ChargeFinance {

    private String chargeId;
    private String name;
    private String document;
    private String dateBirth;
    private String email;
    private String phone;
    private Address address;
    private CardData cardData;
    private String paymentMethod;
    private String amount;
    private String quantityParcels;
}
