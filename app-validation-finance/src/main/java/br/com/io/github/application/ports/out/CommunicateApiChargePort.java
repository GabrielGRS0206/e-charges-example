package br.com.io.github.application.ports.out;

import br.com.io.github.application.model.ChargeFinance;
import br.com.io.github.application.validator.carddata.FieldErrorValidation;

import java.util.List;

public interface CommunicateApiChargePort {

    void send(List<FieldErrorValidation> fields, ChargeFinance chargeFinance);
}
