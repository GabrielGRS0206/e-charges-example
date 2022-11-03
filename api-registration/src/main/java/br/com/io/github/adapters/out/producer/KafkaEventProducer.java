package br.com.io.github.adapters.out.producer;

import br.com.io.github.adapters.in.config.KafkaProducerConfig;
import br.com.io.github.adapters.out.model.Registry;
import com.google.gson.Gson;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.logging.log4j.ThreadContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;

import java.util.UUID;

@Component
@RequiredArgsConstructor
@Log4j2
public class KafkaEventProducer {

    @Autowired
    private KafkaProducerConfig config;
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    @Autowired
    private Gson gson;

    public static final String CHARGE_ID = "CHARGE_ID";

    public void sendEvent(Registry registry){

        ThreadContext.put(CHARGE_ID, UUID.randomUUID().toString());

        setChargeId(registry);

        ProducerRecord<String, String> producerRecord = new ProducerRecord<>(config.getTopicRegistration(), ThreadContext.get(CHARGE_ID), gson.toJson(registry));
        ListenableFuture<SendResult<String, String>> future = kafkaTemplate.send(producerRecord);
    }

    private void setChargeId(Registry registry) {
        registry.setChargeId(ThreadContext.get(CHARGE_ID));
    }
}
