//  This codes are generated automatically. Do not modify!
package org.order.api.application.impl;

import com.geekhalo.ddd.lite.domain.AggregateRepository;
import com.geekhalo.ddd.lite.domain.DomainEventBus;
import com.geekhalo.ddd.lite.domain.support.AbstractApplication;

import java.lang.Long;

import org.order.api.application.BaseGroupAndOrderApplication;
import org.order.domain.customer.aggregation.GroupAndOrder;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

abstract class BaseGroupAndOrderApplicationSupport extends AbstractApplication implements BaseGroupAndOrderApplication {
    @Autowired
    private DomainEventBus domainEventBus;

    protected BaseGroupAndOrderApplicationSupport(Logger logger) {
        super(logger);
    }

    protected BaseGroupAndOrderApplicationSupport() {
    }

    protected DomainEventBus getDomainEventBus() {
        return this.domainEventBus;
    }

    protected abstract AggregateRepository<Long, GroupAndOrder> getGroupAndOrderRepository();
}
