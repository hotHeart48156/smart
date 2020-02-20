package org.order.api.application.impl;

import com.geekhalo.ddd.lite.domain.DomainEventBus;
import org.order.api.application.OrderCreateApplication;
import org.order.domain.customer.vo.OrderParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;

/**
 * @author "yangbiao"
 */
public class OrderCreateApplicationImpl implements OrderCreateApplication {
    @Autowired
    private DomainEventBus domainEventBus;

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void createOrder(OrderParam orderParam) {

    }
}
