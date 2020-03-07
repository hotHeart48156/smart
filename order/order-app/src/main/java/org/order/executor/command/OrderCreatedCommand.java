package org.order.executor.command;


import org.order.domain.vaueobject.id.OrderId;
import org.order.domain.vaueobject.id.OrderItemId;

import java.util.Date;

/**
 * @author "yangbiao"
 */
public class OrderCreatedCommand {

    private OrderId orderId;
    private OrderItemId orderItemId;

    public OrderId getOrderId() {
        return orderId;
    }

    public void setOrderItemId(OrderItemId orderItemId) {
        this.orderItemId = orderItemId;
    }


    public String id() {
        return orderId.getOrderId().toString();
    }

    public void setOrderId(OrderId orderId) {
        this.orderId = orderId;
    }


    public Date occurredOn() {
        return new Date(System.currentTimeMillis());
    }
}
