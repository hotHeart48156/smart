package com.smart.website.message.kafka.configuration.consume.transaction;

import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.embedded.DataSourceFactory;

/**
 * @author "yangbiao"
 * @create 2019121811:08
 */
public class DataSourceTransactionManage {
    DataSourceTransactionManager transactionManager(DataSourceFactory dataSourceFactory) {
        return new DataSourceTransactionManager();
    }
}
