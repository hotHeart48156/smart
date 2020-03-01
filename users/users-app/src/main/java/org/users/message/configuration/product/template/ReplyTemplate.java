package org.users.message.configuration.product.template;

import org.springframework.kafka.requestreply.ReplyingKafkaTemplate;

/**
 * @author "yangbiao"
 * @create 2019122113:52
 */
public interface ReplyTemplate extends Template {
    ReplyingKafkaTemplate<String, String, String> ReplyKafkaTemplate();
}
