package br.com.io.github.adapters.in.web.dto.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CardDataRequestDto {

    /**
    Dados para simulação
     Após a validação junto o parceiro esses dados não serõo enviados ao topic-charge
     Para camada financeira será enviado apenas o status da cobrança -> app-finance
    */

    private String number;
    private String cvv;
    private String validate;
    private String name;
}
