package br.com.io.github.adapters.out.impl;

import br.com.io.github.adapters.out.datastore.entity.ChargeEntity;
import br.com.io.github.adapters.out.datastore.entity.FieldEntity;
import br.com.io.github.adapters.out.datastore.entity.ResultApiCharge;
import br.com.io.github.adapters.out.datastore.mapper.ChargeFinanceMapper;
import br.com.io.github.adapters.out.datastore.repository.ChargeRepository;
import br.com.io.github.adapters.out.datastore.repository.FieldRepository;
import br.com.io.github.application.model.ChargeFinance;
import br.com.io.github.application.ports.out.CommunicateApiChargePort;
import br.com.io.github.application.validator.carddata.FieldErrorValidation;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class ChargeApiDatastoreImpl implements CommunicateApiChargePort {

    private final ChargeRepository chargeRepository;
    private final FieldRepository fieldRepository;
    private final ChargeFinanceMapper chargeMapper;
    @Override
    public void send(List<FieldErrorValidation> fields, ChargeFinance chargeFinance) {

        ChargeEntity entity = chargeRepository.save(chargeMapper.map(chargeFinance));

        if(!Collections.singleton(fields).isEmpty()){
            fieldRepository.save(FieldEntity.builder()
                            .chargeId(entity.getChargeId())
                            .list(fields.stream().map(e -> FieldEntity.FieldInfo.builder()
                                    .message(e.getMessage())
                                    .field(e.getField())
                                    .build()).collect(Collectors.toList()))
                    .build());
        } else {

            ResultApiCharge resultApiCharge = request(entity);

        }
    }

    private ResultApiCharge request(ChargeEntity entity) {
        return ResultApiCharge.builder().build();
    }
}
