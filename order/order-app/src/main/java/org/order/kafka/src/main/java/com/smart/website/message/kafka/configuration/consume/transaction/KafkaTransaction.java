package org.order.kafka.src.main.java.com.smart.website.message.kafka.configuration.consume.transaction;

import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.transaction.KafkaAwareTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionException;
import org.springframework.transaction.TransactionStatus;

/**
 * @author "yangbiao"
 * @create 2019121719:00
 */
public class KafkaTransaction implements KafkaAwareTransactionManager {
    @Override
    public ProducerFactory getProducerFactory() {
        return null;
    }

    @Override
    public Object getResourceFactory() {
        return null;
    }

    @Override
    public TransactionStatus getTransaction(TransactionDefinition definition) throws TransactionException {
        return null;
    }

    @Override
    public void commit(TransactionStatus status) throws TransactionException {

    }

    @Override
    public void rollback(TransactionStatus status) throws TransactionException {

    }
}
