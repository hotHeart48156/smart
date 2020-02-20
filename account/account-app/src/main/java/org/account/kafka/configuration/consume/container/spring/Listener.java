package org.account.kafka.configuration.consume.container.spring;

/**
 * @author "yangbiao"
 * @create 2019121812:12
 */
public interface Listener {
    void listen(String messs);
}
