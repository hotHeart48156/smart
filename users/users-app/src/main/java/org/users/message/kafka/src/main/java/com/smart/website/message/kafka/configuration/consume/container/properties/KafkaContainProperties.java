package org.users.message.kafka.src.main.java.com.smart.website.message.kafka.configuration.consume.container.properties;

import com.smart.website.security.shiro.message.kakfa.consume.listener.code.Listener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.listener.ContainerProperties;

/**
 * @author "yangbiao"
 * @create 2019121810:53
 */
public class KafkaContainProperties implements ContainProperties {
    @Autowired
    Listener listener;

    @Override
    public ContainerProperties properties() {

        ContainerProperties properties = new ContainerProperties("${spring.}");
        properties.setGroupId("ca");
        properties.setMessageListener(listener);
        return properties;
    }

}
