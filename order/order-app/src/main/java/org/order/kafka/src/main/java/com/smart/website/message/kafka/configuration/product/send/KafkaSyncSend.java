package org.order.kafka.src.main.java.com.smart.website.message.kafka.configuration.product.send;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.KafkaException;
import org.springframework.kafka.core.KafkaOperations;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

import java.util.concurrent.ExecutionException;

/**
 * @author "yangbiao"
 * @create 2019121122:07
 */
public class KafkaSyncSend {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    private Gson gson = new GsonBuilder().serializeNulls().create();

    @Transactional
    public void syncSend() throws KafkaException, ExecutionException, InterruptedException {
        ListenableFuture<SendResult<String, String>> future = kafkaTemplate.send("ca", "va");
        future.addCallback(new ListenableFutureCallback<SendResult<String, String>>() {
            @Override
            public void onFailure(Throwable ex) {

            }

            @Override
            public void onSuccess(SendResult<String, String> result) {

            }
        });
        kafkaTemplate.send("a", "e").get();
        kafkaTemplate.getProducerFactory();
        kafkaTemplate.getMessageConverter();
        kafkaTemplate.executeInTransaction(new KafkaOperations.OperationsCallback<String, String, Object>() {
            @Override
            public Object doInOperations(KafkaOperations<String, String> kafkaOperations) {
                return null;
            }
        });

    }
}
