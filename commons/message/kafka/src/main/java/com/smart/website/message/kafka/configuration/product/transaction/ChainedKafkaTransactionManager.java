package com.smart.website.message.kafka.configuration.product.transaction;

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
