package br.com.io.github.application.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ChargeFinanceDto {

    private String chargeId;
    private String name;
    private String document;
    private String dateBirth;
    private String email;
    private String phone;
    private AddressRequestDto address;
    private String paymentMethod;
    private CardDataRequestDto cardData;
    private String amount;
    private String quantityParcels;
}
