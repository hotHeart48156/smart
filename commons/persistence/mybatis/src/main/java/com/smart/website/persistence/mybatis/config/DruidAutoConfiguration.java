package com.smart.website.persistence.mybatis.config;

/**
 * @author "yangbiao"
 */

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DruidAutoConfiguration extends PollConfiguration {

    @Bean
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();//dataSource.setDriverClassName(driverClassName);//如果不配置druid会根据url自动识别dbType，然后选择相应的driverClassName        dataSource.setUrl(url);        dataSource.setUsername(username);        dataSource.setPassword(password);        dataSource.setValidationQuery("SELECT 1");//用来检测连接是否有效        dataSource.setTestOnBorrow(false);//申请连接时执行validationQuery检测连接是否有效，做了这个配置会降低性能
        dataSource.setTestOnReturn(false);//归还连接时执行validationQuery检测连接是否有效，做了这个配置会降低性能        //申请连接的时候检测，如果空闲时间大于timeBetweenEvictionRunsMillis，执行validationQuery检测连接是否有效。
        dataSource.setTestWhileIdle(true);//如果检测失败，则连接将被从池中去除
        dataSource.setTimeBetweenEvictionRunsMillis(600000);
        dataSource.setMaxActive(20);
        dataSource.setInitialSize(10);
        dataSource.setUseUnfairLock(true);
        dataSource.setAsyncInit(true);
        return dataSource;
    }
}
