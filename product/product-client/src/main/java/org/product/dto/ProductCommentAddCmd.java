package org.product.dto;

import com.geekhalo.ddd.lite.domain.AggregateEvent;

import java.util.Date;

/**
 * @author "yangbiao"
 */
public class ProductCommentAddCmd implements AggregateEvent<Long, ProductCommentAdd> {
    @Override
    public ProductCommentAdd source() {
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
