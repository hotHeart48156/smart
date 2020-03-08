package com.smart.website.persistence.mybatis.config;

/**
 * @author "yangbiao"
 */
public class ConnectPoll {
    private void setHikari() {
        PollConfiguration = new HikariDataResourceConfiguration().dataSource();
    }

    private void setDruid() {
        new DruidAutoConfiguration().dataSource();
    }

}
