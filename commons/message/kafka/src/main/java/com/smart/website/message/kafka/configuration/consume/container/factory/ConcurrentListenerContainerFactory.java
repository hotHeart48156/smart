package com.smart.website.message.kafka.configuration.consume.container.factory;

import com.smart.website.security.shiro.message.kakfa.consume.container.converter.Converter;
import com.smart.website.security.shiro.message.kakfa.consume.container.properties.ContainProperties;
import com.smart.website.security.shiro.message.kakfa.consume.factory.ConsumeFactory;
import com.smart.website.security.shiro.message.kakfa.consume.fliter.Filter;
import com.smart.website.security.shiro.message.kakfa.consume.hand.batch.BatchErrorHandle;
import com.smart.website.security.shiro.message.kakfa.consume.transaction.TransactionManage;
import com.smart.website.security.shiro.message.kakfa.product.template.ReplyTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.listener.ContainerProperties;

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
