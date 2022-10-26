package br.com.io.github.adapters.out.datastore.mapper;

import br.com.io.github.adapters.out.datastore.entity.ChargeEntity;
import br.com.io.github.application.dto.ChargeFinanceDto;
import br.com.io.github.application.model.Address;
import br.com.io.github.application.model.CardData;
import br.com.io.github.application.model.ChargeFinance;
import org.springframework.stereotype.Component;

@Component
public class ChargeFinanceMapper {
    public ChargeFinance map(ChargeFinanceDto dto) {
        return ChargeFinance.builder()
                .chargeId(dto.getChargeId())
                .name(dto.getName())
                .phone(dto.getPhone())
                .email(dto.getEmail())
                .dateBirth(dto.getDateBirth())
                .document(dto.getDocument())
                .address(Address.builder()
                        .city(dto.getAddress().getCity())
                        .number(dto.getAddress().getNumber())
                        .country(dto.getAddress().getCountry())
                        .state(dto.getAddress().getState())
                        .build())
                .cardData(CardData.builder()
                        .cvv(dto.getCardData().getCvv())
                        .name(dto.getCardData().getName())
                        .number(dto.getCardData().getNumber())
                        .validate(dto.getCardData().getValidate())
                        .build())
                .paymentMethod(dto.getPaymentMethod())
                .amount(dto.getAmount())
                .quantityParcels(dto.getQuantityParcels())
                .build();
    }

    public ChargeEntity map(ChargeFinance chargeFinance){
        return ChargeEntity.builder()
                .chargeId(chargeFinance.getChargeId())
                .name(chargeFinance.getName())
                .phone(chargeFinance.getPhone())
                .email(chargeFinance.getEmail())
                .dateBirth(chargeFinance.getDateBirth())
                .document(chargeFinance.getDocument())
                .amount(chargeFinance.getAmount())
                .quantityParcels(chargeFinance.getQuantityParcels())
                .paymentMethod(chargeFinance.getPaymentMethod())
                .build();
    }
}
