package br.com.io.github.adapters.events.listener;

import br.com.io.github.adapters.out.datastore.mapper.ChargeFinanceMapper;
import br.com.io.github.application.dto.ChargeFinanceDto;
import br.com.io.github.application.ports.in.ValidationFinanceServicePort;
import com.google.gson.Gson;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Log4j2
@KafkaListener(topics = "${spring.kafka.consumer.topic.topic-registration}")
public class ValidationFinanceListener {

    private final ValidationFinanceServicePort validationFinanceServicePort;
    private final Gson gson;
    private final ChargeFinanceMapper mapper;
    @KafkaHandler
    public void listener(String string){

        log.info("Message -> "+string);
        ChargeFinanceDto dto = gson.fromJson(string, ChargeFinanceDto.class);

        validationFinanceServicePort.validateCharge(mapper.map(dto));

    }
}
