package br.com.io.github.adapters.in.web.controller;

import br.com.io.github.adapters.in.web.dto.response.PaymentMethodsResponseDto;
import br.com.io.github.adapters.out.FeignClientApiPaymentMethod;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/payment_methods")
@Log4j2
public class PaymentMethodControllerV1 {

    @Autowired
    private FeignClientApiPaymentMethod feignClientApiPaymentMethod;

    @GetMapping
    public List<PaymentMethodsResponseDto> findAll(){
        log.info("Get");
        return feignClientApiPaymentMethod.findAll();
    }
}
