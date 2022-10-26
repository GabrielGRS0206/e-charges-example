package br.com.io.github.adapters.in.web.dto.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RegistryRequestDto {

    private String name;
    private String document;
    private String dateBirth;
    private String email;
    private String phone;
    private AddressRequestDto address;
    private String paymentMethod;
    private CardDataRequestDto cardData;
}
