package org.order.kafka.src.main.java.com.smart.website.message.kafka.configuration.consume.transaction;

import org.springframework.kafka.core.ProducerFactory;
import org.springframework.transaction.PlatformTransactionManager;

/**
 * @author "yangbiao"
 * @create 2019121811:15
 */
public class ChainedKafkaTransactionManager implements TransactionManage {
    @Override
    public PlatformTransactionManager transactionManager(ProducerFactory producerFactory) {
        return null;
    }

}
