//  This codes are generated automatically. Do not modify!
package org.order.api.application.impl;

import com.geekhalo.ddd.lite.domain.AggregateRepository;
import com.geekhalo.ddd.lite.domain.DomainEventBus;
import com.geekhalo.ddd.lite.domain.support.AbstractApplication;

import java.lang.Long;

import org.order.api.application.BaseMoneyInfoApplication;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

abstract class BaseMoneyInfoApplicationSupport extends AbstractApplication implements BaseMoneyInfoApplication {
    @Autowired
    private DomainEventBus domainEventBus;

    protected BaseMoneyInfoApplicationSupport(Logger logger) {
        super(logger);
    }

    protected BaseMoneyInfoApplicationSupport() {
    }

    protected DomainEventBus getDomainEventBus() {
        return this.domainEventBus;
    }

    protected abstract AggregateRepository<Long, MoneyInfo> getMoneyInfoRepository();
}
