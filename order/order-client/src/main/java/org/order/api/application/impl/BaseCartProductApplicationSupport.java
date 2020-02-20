//  This codes are generated automatically. Do not modify!
package org.order.api.application.impl;

import com.geekhalo.ddd.lite.domain.AggregateRepository;
import com.geekhalo.ddd.lite.domain.DomainEventBus;
import com.geekhalo.ddd.lite.domain.support.AbstractApplication;

import java.lang.Long;

import org.order.api.application.BaseCartProductApplication;
import org.order.domain.customer.aggregation.CartProduct;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

abstract class BaseCartProductApplicationSupport extends AbstractApplication implements BaseCartProductApplication {
    @Autowired
    private DomainEventBus domainEventBus;

    protected BaseCartProductApplicationSupport(Logger logger) {
        super(logger);
    }

    protected BaseCartProductApplicationSupport() {
    }

    protected DomainEventBus getDomainEventBus() {
        return this.domainEventBus;
    }

    protected abstract AggregateRepository<Long, CartProduct> getCartProductRepository();
}
