package org.order.dto.aggredto;

import lombok.Data;
import org.order.domain.aggregation.Order;
import org.order.domain.vaueobject.ValueObjectFactory;
import org.order.domain.vaueobject.status.OrderStatus;
import org.order.dto.AbstractDto;

@Data
public class OrderStatusDto   extends AbstractDto {
    private String OrderId;
    private String orderStatus;

    public void accept(Order order) {
        order.setOrderId(ValueObjectFactory.newInstance(org.order.domain.vaueobject.id.OrderId.class, this.OrderId));
        order.setOrderStatus(ValueObjectFactory.newInstance(OrderStatus.class, this.orderStatus));
    }
}
