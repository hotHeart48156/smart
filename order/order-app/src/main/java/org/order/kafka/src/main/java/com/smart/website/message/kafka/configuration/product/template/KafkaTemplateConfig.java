package org.order.kafka.src.main.java.com.smart.website.message.kafka.configuration.product.template;

import org.order.kafka.src.main.java.com.smart.website.message.kafka.configuration.product.factory.ProductFactory;
import org.order.kafka.src.main.java.com.smart.website.message.kafka.configuration.product.result.handle.KafkaResultHandle;
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
