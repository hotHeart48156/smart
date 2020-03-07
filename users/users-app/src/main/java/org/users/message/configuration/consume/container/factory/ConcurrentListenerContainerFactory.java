package org.users.message.configuration.consume.container.factory;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.listener.ContainerProperties;
import org.users.message.configuration.consume.container.converter.Converter;
import org.users.message.configuration.consume.factory.ConsumeFactory;
import org.users.message.configuration.consume.fliter.Filter;
import org.users.message.configuration.consume.hand.batch.BatchErrorHandle;

/**
 * @author "yangbiao"
 * @create 2019121720:54
 */
@EnableKafka
@Configuration
public class ConcurrentListenerContainerFactory implements ListenerContainerFactory {
    @Autowired
    @Qualifier("ConsumeFactoryDev")
    ConsumeFactory consumerFactory;
    @Autowired
    @Qualifier("BatchErrorHandle")
    BatchErrorHandle handle;
    @Autowired
    @Qualifier("KafkaFilterStratege")
    Filter filter;
    @Autowired
    @Qualifier("KafkaMessageConverter")
    Converter converter;
    @Autowired
    @Qualifier("KafkaTransactionManage")
    TransactionManage manage;

    @Autowired
    @Qualifier("KafkaReplyingTemplateConfig")
    ReplyTemplate template;
    @Autowired
    ContainProperties properties;

    @Override
    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, String> kafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, String> factory =
                new ConcurrentKafkaListenerContainerFactory<>();
        factory.setReplyTemplate(template.ReplyKafkaTemplate());
        factory.setConsumerFactory(consumerFactory.consumerFactory());
        factory.setBatchErrorHandler(handle);
        factory.setRecordFilterStrategy(filter.filter());
        //启用批量消费
        factory.setBatchListener(true);
        factory.setMessageConverter(converter.messageConverter());
        factory.setAckDiscarded(true);
        factory.setConcurrency(3);
        factory.getContainerProperties().setAckMode(ContainerProperties.AckMode.MANUAL_IMMEDIATE);
        return factory;
    }


}
