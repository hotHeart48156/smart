package com.geekhalo.ddd.lite.spring.eventbus;

import com.geekhalo.ddd.lite.domain.DomainEventBus;
import com.geekhalo.ddd.lite.domain.support.DefaultDomainEventBus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class EventBusAutoConfiguration {
    @Bean
    @ConditionalOnMissingBean
    public DomainEventBus domainEventBus() {
        return new DefaultDomainEventBus();
    }

    @Bean
    public SpringEventDispatcher springEventDispatcher() {
        return new SpringEventDispatcher();
    }
}
