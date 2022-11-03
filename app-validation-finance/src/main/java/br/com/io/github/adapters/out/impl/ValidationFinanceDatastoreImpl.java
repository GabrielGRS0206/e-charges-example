package br.com.io.github.adapters.out.impl;

import br.com.io.github.application.model.ChargeFinance;
import br.com.io.github.application.ports.in.ValidationFinanceServicePort;
import br.com.io.github.application.ports.out.CommunicateApiChargePort;
import br.com.io.github.application.validator.ValidatorFields;
import br.com.io.github.application.validator.carddata.CardDataValidation;
import br.com.io.github.application.validator.carddata.FieldErrorValidation;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
@Log4j2
public class ValidationFinanceDatastoreImpl implements ValidationFinanceServicePort {

    private final ValidatorFields validatorFields;
    private final CommunicateApiChargePort communicateApiChargePort;
    @Override
    public void validateCharge(ChargeFinance chargeFinance) {

        List<FieldErrorValidation> fields = validatorFields.validate(CardDataValidation.builder()
                        .cvv(chargeFinance.getCardData().getCvv())
                        .validate(chargeFinance.getCardData().getValidate())
                        .name(chargeFinance.getCardData().getName())
                        .number(chargeFinance.getCardData().getNumber())
                .build()
        );

        communicateApiChargePort.send(fields, chargeFinance);
    }
}
