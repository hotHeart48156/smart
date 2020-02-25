//  This codes are generated automatically. Do not modify!
package org.order.api.application.impl;

import com.geekhalo.ddd.lite.domain.AggregateRepository;
import com.geekhalo.ddd.lite.domain.DomainEventBus;
import com.geekhalo.ddd.lite.domain.support.AbstractApplication;

import java.lang.Long;

import org.order.api.application.BaseOrderDeliveryApplication;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

abstract class BaseOrderDeliveryApplicationSupport extends AbstractApplication implements BaseOrderDeliveryApplication {
    @Autowired
    private DomainEventBus domainEventBus;

    protected BaseOrderDeliveryApplicationSupport(Logger logger) {
        super(logger);
    }

    protected BaseOrderDeliveryApplicationSupport() {
    }

    protected DomainEventBus getDomainEventBus() {
        return this.domainEventBus;
    }

    protected abstract AggregateRepository<Long, OrderDelivery> getOrderDeliveryRepository();
}
