package org.product.dto;

import com.geekhalo.ddd.lite.domain.AggregateEvent;
import org.product.domain.aggragate.ProductAdd;

import java.util.Date;

/**
 * @author "yangbiao"
 */
public class ProductAddCmd implements AggregateEvent<Long, ProductAdd> {
    @Override
    public ProductAdd source() {
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
