package org.users.message.kafka.src.main.java.com.smart.website.message.kafka.configuration.consume.listener.code;

import org.apache.kafka.clients.consumer.Consumer;
import org.springframework.kafka.listener.BatchConsumerAwareMessageListener;

import java.util.List;

/**
 * @author "yangbiao"
 * @create 2019121720:36
 */
public class BatchConsumerListener implements BatchConsumerAwareMessageListener {
    @Override
    public void onMessage(List list, Consumer consumer) {

    }

    @Override
    public void onMessage(Object o) {

    }
}
