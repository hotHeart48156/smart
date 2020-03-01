package org.users.message.kafka.src.main.java.com.smart.website.message.kafka.configuration.product.template;


import com.smart.website.message.kafka.configuration.consume.container.Container;
import com.smart.website.message.kafka.configuration.consume.container.ReplyContainer;
import com.smart.website.message.kafka.configuration.consume.container.properties.ContainProperties;
import com.smart.website.message.kafka.configuration.product.factory.ProductFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.requestreply.ReplyingKafkaTemplate;


/**
 * @author yangbiao
 * @date 20191217
 */
@Configuration
public class KafkaReplyingTemplateConfig<S, S1> implements ReplyTemplate {

    @Autowired
    ContainProperties properties;
    @Qualifier("KafkaDefaultFactory")
    ProductFactory factory;
    @Autowired
    Container container;


    @Override
    @Bean
    public ReplyingKafkaTemplate<String, String, String> ReplyKafkaTemplate() {
        ReplyContainer container = new ReplyContainer();
        ReplyingKafkaTemplate template = new ReplyingKafkaTemplate(factory.ProductFactory(), container.replyingContainer());
        return template;
    }


}
