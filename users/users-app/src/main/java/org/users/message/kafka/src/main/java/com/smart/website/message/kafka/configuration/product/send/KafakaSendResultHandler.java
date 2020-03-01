package org.users.message.kafka.src.main.java.com.smart.website.message.kafka.configuration.product.send;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.springframework.kafka.support.ProducerListener;

/**
 * @author "yangbiao"
 * @date 2019121121:54
 */
@Slf4j
public class KafakaSendResultHandler implements ProducerListener {
    @Override
    public void onSuccess(ProducerRecord producerRecord, RecordMetadata recordMetadata) {

    }

    @Override
    public void onError(ProducerRecord producerRecord, Exception exception) {

    }

}
