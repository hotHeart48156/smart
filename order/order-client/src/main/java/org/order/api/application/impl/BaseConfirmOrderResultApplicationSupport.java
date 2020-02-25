//  This codes are generated automatically. Do not modify!
package org.order.api.application.impl;

import com.geekhalo.ddd.lite.domain.AggregateRepository;
import com.geekhalo.ddd.lite.domain.DomainEventBus;
import com.geekhalo.ddd.lite.domain.support.AbstractApplication;

import java.lang.Long;

import org.order.api.application.BaseConfirmOrderResultApplication;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

abstract class BaseConfirmOrderResultApplicationSupport extends AbstractApplication implements BaseConfirmOrderResultApplication {
    @Autowired
    private DomainEventBus domainEventBus;

    protected BaseConfirmOrderResultApplicationSupport(Logger logger) {
        super(logger);
    }

    protected BaseConfirmOrderResultApplicationSupport() {
    }

    protected DomainEventBus getDomainEventBus() {
        return this.domainEventBus;
    }

    protected abstract AggregateRepository<Long, ConfirmOrderResult> getConfirmOrderResultRepository(
    );
}
