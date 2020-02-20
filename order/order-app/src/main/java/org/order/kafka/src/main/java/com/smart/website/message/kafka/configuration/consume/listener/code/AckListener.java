package org.order.kafka.src.main.java.com.smart.website.message.kafka.configuration.consume.listener.code;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.listener.AcknowledgingMessageListener;
import org.springframework.kafka.support.Acknowledgment;

/**
 * @author "yangbiao"
 * @create 2019121720:32
 */
public class AckListener implements AcknowledgingMessageListener<String, String> {
    @Override
    public void onMessage(ConsumerRecord<String, String> consumerRecord, Acknowledgment acknowledgment) {

    }
}
