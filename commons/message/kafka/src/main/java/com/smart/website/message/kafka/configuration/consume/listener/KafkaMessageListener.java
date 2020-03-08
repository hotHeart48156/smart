package com.smart.website.message.kafka.configuration.consume.listener;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Slf4j
public class KafkaMessageListener implements CommandLineRunner {
    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;

    @KafkaListener()
    public void listen(ConsumerRecord<String, String> consumerRecord) throws Exception {
        log.debug(Thread.currentThread().getName() + "{}", consumerRecord.value());
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Start producer");
        for (int i = 0; i < 1000; i++) {
            kafkaTemplate.send("real", UUID.randomUUID().toString(), "i" + i);

        }
    }
}
