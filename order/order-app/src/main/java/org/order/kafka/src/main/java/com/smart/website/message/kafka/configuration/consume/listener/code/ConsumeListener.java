package org.order.kafka.src.main.java.com.smart.website.message.kafka.configuration.consume.listener.code;

import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.listener.ConsumerAwareMessageListener;

/**
 * @author "yangbiao"
 * @create 2019121720:33
 */
public class ConsumeListener implements ConsumerAwareMessageListener<String, String> {

    @Override
    public void onMessage(ConsumerRecord<String, String> consumerRecord, Consumer<?, ?> consumer) {

    }
}
