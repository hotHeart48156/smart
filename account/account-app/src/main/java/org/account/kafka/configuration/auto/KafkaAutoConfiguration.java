package org.account.kafka.configuration.auto;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.kafka.annotation.KafkaListenerAnnotationBeanPostProcessor;
import org.springframework.kafka.core.*;
import org.springframework.kafka.security.jaas.KafkaJaasLoginModuleInitializer;
import org.springframework.kafka.support.LoggingProducerListener;
import org.springframework.kafka.support.ProducerListener;
import org.springframework.kafka.transaction.KafkaTransactionManager;

import java.io.IOException;

/**
 * @author "yangbiao"
 */

@Configuration
@AutoConfigureAfter(org.springframework.boot.autoconfigure.kafka.KafkaAutoConfiguration.class)
@ConditionalOnBean(KafkaTemplate.class)
@Import(KafkaListenerAnnotationBeanPostProcessor.class)
@EnableConfigurationProperties(KafkaProperties.class)
public class KafkaAutoConfiguration {
    private final KafkaProperties kafkaProperties;
    private final ProducerFactory<Object, Object> productFactory;
    private final ProducerListener<Object, Object> producerListener;

    public KafkaAutoConfiguration(KafkaProperties properties, ProducerFactory<Object, Object> Factory, ProducerListener Listener) {

        kafkaProperties = properties;
        productFactory = Factory;
        producerListener = Listener;
    }

    @Bean
    @ConditionalOnMissingBean(KafkaTemplate.class)
    public KafkaTemplate<?, ?> kafkaTemplate() {

        KafkaTemplate<Object, Object> kafkaTemplate = new KafkaTemplate<>(productFactory);
        kafkaTemplate.setProducerListener(producerListener);
        kafkaTemplate.setDefaultTopic(this.kafkaProperties.getTemplate().getDefaultTopic());
        return kafkaTemplate;
    }

    @Bean

    @ConditionalOnMissingBean(ProducerListener.class)

    public ProducerListener<Object, Object> kafkaProducerListener() {

        return new LoggingProducerListener<Object, Object>();

    }


    @Bean

    @ConditionalOnMissingBean(ConsumerFactory.class)

    public ConsumerFactory<?, ?> kafkaConsumerFactory() {

        return new DefaultKafkaConsumerFactory<Object, Object>(

                this.kafkaProperties.buildConsumerProperties());

    }


    @Bean

    @ConditionalOnMissingBean(ProducerFactory.class)

    public ProducerFactory<?, ?> kafkaProducerFactoryc() {

        return new DefaultKafkaProducerFactory<Object, Object>(

                this.kafkaProperties.buildProducerProperties());

    }

    @Bean
    @ConditionalOnMissingBean(ProducerListener.class)
    public ProducerListener<Object, Object> kafkaProducerListenerc() {
        return new LoggingProducerListener<>();
    }


    @Bean
    @ConditionalOnMissingBean(ConsumerFactory.class)
    public ConsumerFactory<?, ?> kafkaConsumerFactoryc() {
        return new DefaultKafkaConsumerFactory<>(
                this.kafkaProperties.buildConsumerProperties());
    }

    @Bean
    @ConditionalOnMissingBean(ProducerFactory.class)
    public ProducerFactory<?, ?> kafkaProducerFactory() {
        DefaultKafkaProducerFactory<?, ?> factory = new DefaultKafkaProducerFactory<>(this.kafkaProperties.buildProducerProperties());
        String transactionIdPrefix = this.kafkaProperties.getProducer().getTransactionIdPrefix();
        if (transactionIdPrefix != null) {
            factory.setTransactionIdPrefix(transactionIdPrefix);
        }
        return factory;

    }


    @Bean
    @ConditionalOnProperty(name = "spring.kafka.producer.transaction-id-prefix")
    @ConditionalOnMissingBean
    public KafkaTransactionManager<?, ?> kafkaTransactionManager(ProducerFactory<?, ?> producerFactory) {
        return new KafkaTransactionManager<>(producerFactory);
    }

    @Bean
    @ConditionalOnProperty(name = "spring.kafka.jaas.enabled")
    @ConditionalOnMissingBean
    public KafkaJaasLoginModuleInitializer kafkaJaasInitializer() throws IOException {
        KafkaJaasLoginModuleInitializer jaas = new KafkaJaasLoginModuleInitializer();
        KafkaProperties.Jaas jaasProperties = this.kafkaProperties.getJaas();
        if (jaasProperties.getControlFlag() != null) {
            jaas.setControlFlag(jaasProperties.getControlFlag());
        }
        if (jaasProperties.getLoginModule() != null) {
            jaas.setLoginModule(jaasProperties.getLoginModule());
        }
        jaas.setOptions(jaasProperties.getOptions());
        return jaas;
    }

    @Bean
    @ConditionalOnMissingBean
    public KafkaAdmin kafkaAdmin() {
        KafkaAdmin kafkaAdmin = new KafkaAdmin(this.kafkaProperties.buildAdminProperties());
        kafkaAdmin.setFatalIfBrokerNotAvailable(this.kafkaProperties.getAdmin().isFailFast());
        return kafkaAdmin;
    }

}
