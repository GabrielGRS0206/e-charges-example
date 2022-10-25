package br.com.io.github.adapters.in.web.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaymentMethodsResponseDto {

    private String paymentMethod;
    private String quantityParcels;
}
