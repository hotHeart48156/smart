package org.users.message.kafka.src.main.java.com.smart.website.message.kafka.configuration.consume.listener.code;

import org.springframework.kafka.listener.BatchAcknowledgingMessageListener;
import org.springframework.kafka.support.Acknowledgment;

import java.util.List;

/**
 * @author "yangbiao"
 * @create 2019121720:36
 */
public class BatchAckListener implements BatchAcknowledgingMessageListener {
    @Override
    public void onMessage(List list, Acknowledgment acknowledgment) {

    }

    @Override
    public void onMessage(Object o) {

    }
}
