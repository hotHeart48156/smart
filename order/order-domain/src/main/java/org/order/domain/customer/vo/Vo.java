package org.order.domain.customer.vo;

import org.order.domain.customer.vaueobject.ValueObject;

/**
 * @author "yangbiao"
 */
public interface Vo {
    public <T extends ValueObject> void accept(T e);

}
