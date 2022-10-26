package br.com.io.github.adapters.in.web.controller;

import br.com.io.github.adapters.in.web.dto.request.RegistryRequestDto;
import br.com.io.github.adapters.in.web.dto.response.RegistryResponseDto;
import br.com.io.github.adapters.in.web.mapper.RegistryMapper;
import br.com.io.github.adapters.out.producer.KafkaEventProducer;
import org.apache.logging.log4j.ThreadContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static br.com.io.github.adapters.out.producer.KafkaEventProducer.CHARGE_ID;

@RestController
@RequestMapping("/v1/registrys")
public class ChargeControllerV1 {

    @Autowired
    private KafkaEventProducer kafkaEventProducer;
    @Autowired
    private RegistryMapper mapper;

    @PostMapping
    public ResponseEntity<RegistryResponseDto> charge(@RequestBody RegistryRequestDto requestDto){

        kafkaEventProducer.sendEvent(mapper.map(requestDto));

        return ResponseEntity.ok(RegistryResponseDto.builder()
                .chargeId(ThreadContext.get(CHARGE_ID))
                .build());
    }
}
