package com.smart.website.message.kafka.configuration.product.template;

import com.smart.website.security.shiro.message.kakfa.product.factory.ProductFactory;
import com.smart.website.security.shiro.message.kakfa.product.result.handle.KafkaResultHandle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;

/**
 * @author yangbiao
 * @date 20191217
 */
@Configuration
public class KafkaTemplateConfig<S, S1> implements Template {
    @Autowired
    ProductFactory factory;
    @Autowired
    KafkaResultHandle handle;

    @Bean
    public KafkaTemplate<Integer, String> kafkaTemplate() {
        KafkaTemplate kafkaTemplate = new KafkaTemplate<Integer, String>(factory.ProductFactory());
        kafkaTemplate.setProducerListener(handle);
        return kafkaTemplate;
    }


}
