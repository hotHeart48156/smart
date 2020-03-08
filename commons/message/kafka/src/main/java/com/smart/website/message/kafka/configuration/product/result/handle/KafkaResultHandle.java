package com.smart.website.message.kafka.configuration.product.result.handle;

import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.springframework.kafka.support.ProducerListener;

/**
 * @author "yangbiao"
 * @create 2019121923:22
 */
public class KafkaResultHandle implements ProducerListener, ResultHandle {
    @Override
    public void onError(ProducerRecord producerRecord, Exception exception) {

    }

    @Override
    public void onSuccess(ProducerRecord producerRecord, RecordMetadata recordMetadata) {

    }


    @Override
    public void hand() {

    }
}
