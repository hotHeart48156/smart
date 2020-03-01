package org.users.message.configuration.consume.fliter;

import org.springframework.kafka.listener.adapter.RecordFilterStrategy;

/**
 * @author "yangbiao"
 * @create 2019121811:48
 */
public interface Filter extends RecordFilterStrategy {
    RecordFilterStrategy<? super String, ? super String> filter();
}
