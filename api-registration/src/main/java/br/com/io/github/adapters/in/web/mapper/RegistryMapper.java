package br.com.io.github.adapters.in.web.mapper;

import br.com.io.github.adapters.in.web.dto.request.RegistryRequestDto;
import br.com.io.github.adapters.out.model.Address;
import br.com.io.github.adapters.out.model.CardData;
import br.com.io.github.adapters.out.model.Registry;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class RegistryMapper {

    public Registry map(RegistryRequestDto requestDto) {
        return Registry.builder()
                .document(requestDto.getDocument())
                .name(requestDto.getName())
                .dateBirth(requestDto.getDateBirth())
                .email(requestDto.getEmail())
                .phone(requestDto.getPhone())
                .address(Address.builder()
                        .city(requestDto.getAddress().getCity())
                        .country(requestDto.getAddress().getCountry())
                        .number(requestDto.getAddress().getNumber())
                        .state(requestDto.getAddress().getState())
                        .build())
                .cardData(CardData.builder()
                        .cvv(requestDto.getCardData().getCvv())
                        .name(requestDto.getCardData().getName())
                        .validate(requestDto.getCardData().getValidate())
                        .number(requestDto.getCardData().getNumber())
                        .build())
                .build();
    }
}
