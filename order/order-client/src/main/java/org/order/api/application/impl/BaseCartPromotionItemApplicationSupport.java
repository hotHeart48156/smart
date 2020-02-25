//  This codes are generated automatically. Do not modify!
package org.order.api.application.impl;

import com.geekhalo.ddd.lite.domain.AggregateRepository;
import com.geekhalo.ddd.lite.domain.DomainEventBus;
import com.geekhalo.ddd.lite.domain.support.AbstractApplication;

import java.lang.Long;

import org.order.api.application.BaseCartPromotionItemApplication;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

abstract class BaseCartPromotionItemApplicationSupport extends AbstractApplication implements BaseCartPromotionItemApplication {
    @Autowired
    private DomainEventBus domainEventBus;

    protected BaseCartPromotionItemApplicationSupport(Logger logger) {
        super(logger);
    }

    protected BaseCartPromotionItemApplicationSupport() {
    }

    protected DomainEventBus getDomainEventBus() {
        return this.domainEventBus;
    }

    protected abstract AggregateRepository<Long, CartPromotionItem> getCartPromotionItemRepository();
}
