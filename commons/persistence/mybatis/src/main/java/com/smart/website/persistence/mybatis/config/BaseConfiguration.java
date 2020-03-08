package com.smart.website.persistence.mybatis.config;

import com.smart.website.persistence.configuration.PersistenceConfiguration;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author "yangbiao"
 */
@Accessors(chain = true, fluent = true)
@Data
@Configuration
@ConfigurationProperties
public class BaseConfiguration implements PersistenceConfiguration {
    ConnectPoll connectPoll;
    private String username;
    private String password;
    private String Url;

}
