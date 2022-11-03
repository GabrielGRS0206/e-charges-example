package br.com.io.github.adapters.out;

import br.com.io.github.adapters.in.web.dto.response.PaymentMethodsResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "PaymentMethod", url = "${url-payment-method}")
public interface FeignClientApiPaymentMethod {

    @GetMapping("/v1/payments_methods")
    List<PaymentMethodsResponseDto> findAll();
}
