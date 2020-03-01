package org.users.message.configuration.consume.listener.code;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.listener.BatchMessageListener;

import java.util.List;

/**
 * @author "yangbiao"
 * @create 2019121720:35
 */
public class BatchListener implements BatchMessageListener<String, String> {
    @Override
    public void onMessage(List<ConsumerRecord<String, String>> consumerRecords) {

    }
}
