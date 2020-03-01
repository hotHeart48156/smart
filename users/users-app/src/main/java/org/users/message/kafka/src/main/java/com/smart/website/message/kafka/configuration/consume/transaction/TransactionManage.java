package org.users.message.kafka.src.main.java.com.smart.website.message.kafka.configuration.consume.transaction;

import org.springframework.kafka.core.ProducerFactory;
import org.springframework.transaction.PlatformTransactionManager;

/**
 * @author "yangbiao"
 * @create 2019121811:06
 */
public interface TransactionManage {
    PlatformTransactionManager transactionManager(ProducerFactory producerFactory);
}
