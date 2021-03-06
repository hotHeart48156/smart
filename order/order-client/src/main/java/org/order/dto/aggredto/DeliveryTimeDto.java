package org.order.dto.aggredto;

import lombok.Data;
import org.order.domain.aggregation.Order;
import org.order.domain.vaueobject.ValueObjectFactory;
import org.order.domain.vaueobject.time.DeliveryTime;
import org.order.dto.AbstractDto;

@Data
public class DeliveryTimeDto   extends AbstractDto {
    private String OrderId;
    private String deliverTime;

    public void accept(Order order) {
        order.setOrderId(ValueObjectFactory.newInstance(org.order.domain.vaueobject.id.OrderId.class, this.OrderId));
        order.setDeliverTime(ValueObjectFactory.newInstance(DeliveryTime.class, this.deliverTime));
    }
}
