package org.order.kafka.src.main.java.com.smart.website.message.kafka.configuration.consume.hand.batch;

import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.springframework.kafka.listener.BatchErrorHandler;


/**
 * @author "yangbiao"
 * @create 2019121811:42
 */
public class BatchErrorHandle implements BatchErrorHandler {
    @Override
    public void handle(Exception e, ConsumerRecords<?, ?> consumerRecords) {

    }


    public Object handle() {
        return null;
    }
}
