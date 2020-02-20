//  This codes are generated automatically. Do not modify!
package org.order.api.application.impl;

import com.geekhalo.ddd.lite.domain.AggregateRepository;
import com.geekhalo.ddd.lite.domain.DomainEventBus;
import com.geekhalo.ddd.lite.domain.support.AbstractApplication;

import java.lang.Long;

import org.order.api.application.BaseReceivedStatusUpdateApplication;
import org.order.domain.customer.aggregation.ReceivedStatusUpdate;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

abstract class BaseReceivedStatusUpdateApplicationSupport extends AbstractApplication implements BaseReceivedStatusUpdateApplication {
    @Autowired
    private DomainEventBus domainEventBus;

    protected BaseReceivedStatusUpdateApplicationSupport(Logger logger) {
        super(logger);
    }

    protected BaseReceivedStatusUpdateApplicationSupport() {
    }

    protected DomainEventBus getDomainEventBus() {
        return this.domainEventBus;
    }

    protected abstract AggregateRepository<Long, ReceivedStatusUpdate> getReceivedStatusUpdateRepository(
    );
}
