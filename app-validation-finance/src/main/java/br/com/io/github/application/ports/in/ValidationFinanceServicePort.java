package br.com.io.github.application.ports.in;

import br.com.io.github.application.model.ChargeFinance;

public interface ValidationFinanceServicePort {

    void validateCharge(ChargeFinance chargeFinance);
}
