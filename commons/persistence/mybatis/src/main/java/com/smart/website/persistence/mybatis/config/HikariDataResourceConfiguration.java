package com.smart.website.persistence.mybatis.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import com.zaxxer.hikari.metrics.dropwizard.CodaHaleMetricsTracker;
import com.zaxxer.hikari.metrics.dropwizard.CodahaleHealthChecker;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * @author "yangbiao"
 */
@Configuration
public class HikariDataResourceConfiguration extends PollConfiguration {
    @Bean
    public DataSource dataSource() {
        HikariConfig config = new HikariConfig();
        config.setUsername(getUsername());
        config.setPassword(getPassword());
        config.setJdbcUrl(getUrl());
        config.setPoolName("default");
        config.setAutoCommit(true);
        config.setMinimumIdle(1);
        config.setMaximumPoolSize(8);
        config.setMetricRegistry(new CodaHaleMetricsTracker("default", "", "fd"));
        config.setHealthCheckRegistry(new CodahaleHealthChecker());
        HikariDataSource ds = new HikariDataSource(config);
        return ds;
    }

    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }

    @Bean(name = "primarySqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        sessionFactory.getObject().getConfiguration().setMapUnderscoreToCamelCase(true);
        return sessionFactory.getObject();
    }

}
