package org.account.kafka.configuration.product.send;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;


@Component
@Slf4j
public class KafakaSender {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    private Gson gson = new GsonBuilder().serializeNulls().create();

    public void send(String topic, Message message) {
        ListenableFuture<SendResult<String, String>> future = kafkaTemplate.send("ad", "ad");
        future.addCallback(new ListenableFutureCallback<SendResult<String, String>>() {
            @Override
            public void onFailure(Throwable ex) {

            }

            @Override
            public void onSuccess(SendResult<String, String> result) {

            }
        });
        log.info("topic", gson.toJson(message));

    }
}
