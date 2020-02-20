package org.order.eventhandler;

import com.geekhalo.ddd.lite.domain.AggregateEvent;
import com.geekhalo.ddd.lite.domain.DomainEvent;
import org.order.domain.customer.vaueobject.id.OrderId;

import java.util.Date;

/**
 * @author "yangbiao"
 */
public class OrderCreateHandle implements DomainEvent {
    private OrderId orderId;

    public void setOrderId(OrderId orderId) {
        this.orderId = orderId;
    }

    @Override
    public String id() {
        return orderId.getOrderId().toString();
    }

    @Override
    public Date occurredOn() {
        return new Date(System.currentTimeMillis());
    }
}
