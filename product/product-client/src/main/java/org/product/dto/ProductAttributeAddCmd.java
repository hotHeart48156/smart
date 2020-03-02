package org.product.dto;

import com.geekhalo.ddd.lite.domain.AggregateEvent;

import java.util.Date;

/**
 * @author "yangbiao"
 */
public class ProductAttributeAddCmd implements AggregateEvent<Long, ProductAttributeChange> {
    @Override
    public ProductAttributeChange source() {
        return null;
    }

    @Override
    public String id() {
        return null;
    }

    @Override
    public Date occurredOn() {
        return null;
    }
}
