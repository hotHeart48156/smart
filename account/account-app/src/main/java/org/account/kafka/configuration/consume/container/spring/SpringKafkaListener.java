package org.account.kafka.configuration.consume.container.spring;

import com.smart.website.security.shiro.message.kakfa.consume.container.factory.ListenerContainerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.config.KafkaListenerEndpointRegistrar;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

/**
 * @author "yangbiao"
 * @create 2019121812:13
 */
public class SpringKafkaListener implements Listener {
    @Autowired
    ListenerContainerFactory factory;
    @Autowired
    KafkaListenerEndpointRegistrar registrar;
    @Autowired
    LocalValidatorFactoryBean validatorFactoryBean;

    @Override
    @KafkaListener(id = "dea", topics = "ca", autoStartup = "${listen.auto.start.true}", containerFactory = "factory"
    )
    public void listen(String messs) {

    }


}
