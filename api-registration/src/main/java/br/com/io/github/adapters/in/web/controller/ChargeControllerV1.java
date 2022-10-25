package br.com.io.github.adapters.in.web.controller;

import br.com.io.github.adapters.in.web.dto.request.RegistryRequestDto;
import br.com.io.github.adapters.in.web.dto.response.RegistryResponseDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/registrys")
public class ChargeControllerV1 {

    @PostMapping
    public RegistryResponseDto charge(@RequestBody RegistryRequestDto requestDto){

        return RegistryResponseDto.builder().build();
    }
}
