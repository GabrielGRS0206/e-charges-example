package br.com.io.github.adapters.in.web.controller;

import br.com.io.github.adapters.in.web.dto.response.PaymentMethodsResponseDto;
import br.com.io.github.adapters.in.web.enums.TypePayment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/v1/payment_methods")
public class PaymentMethodControllerV1 {

    @GetMapping
    public List<PaymentMethodsResponseDto> methods(){
        return mock();
    }

    private List<PaymentMethodsResponseDto> mock() {
        return Arrays.asList(
                PaymentMethodsResponseDto.builder()
                        .paymentMethod(TypePayment.DEBITO.name())
                        .build(),
                PaymentMethodsResponseDto.builder()
                        .paymentMethod(TypePayment.PIX.name())
                        .build(),
                PaymentMethodsResponseDto.builder()
                        .paymentMethod(TypePayment.CREDITO.name())
                        .quantityParcels("1X")
                        .build(),
                PaymentMethodsResponseDto.builder()
                        .paymentMethod(TypePayment.CREDITO.name())
                        .quantityParcels("2X")
                        .build(),
                PaymentMethodsResponseDto.builder()
                        .paymentMethod(TypePayment.CREDITO.name())
                        .quantityParcels("3X")
                        .build()
        );
    }
}
