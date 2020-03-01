package org.users.message.configuration.consume.transaction;

import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.transaction.KafkaTransactionManager;

/**
 * @author "yangbiao"
 * @create 2019121811:07
 */
public class KafkaTransactionManage implements TransactionManage {
    @Override
    public KafkaTransactionManager transactionManager(ProducerFactory producerFactory) {
        KafkaTransactionManager manager = new KafkaTransactionManager(producerFactory);

        return manager;
    }
}
