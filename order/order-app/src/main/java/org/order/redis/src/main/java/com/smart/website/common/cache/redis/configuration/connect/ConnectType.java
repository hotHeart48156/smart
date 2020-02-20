package org.order.redis.src.main.java.com.smart.website.common.cache.redis.configuration.connect;

import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.support.PersistableIsNewStrategy;

/**
 * @author "yangbiao"
 */
public enum ConnectType {
    TYPE {RedisStandaloneConfiguration,EnumDesc}

}
