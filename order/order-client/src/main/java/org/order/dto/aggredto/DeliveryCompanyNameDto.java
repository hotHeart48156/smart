package org.order.dto.aggredto;

import lombok.Data;
import org.order.domain.aggregation.Order;
import org.order.domain.vaueobject.ValueObjectFactory;
import org.order.domain.vaueobject.name.DeliveryCompanyName;

@Data
public class DeliveryCompanyNameDto {
    private String OrderId;
    private String deliveryCompanyName;

    public void accept(Order order) {
        order.setOrderId(ValueObjectFactory.newInstance(org.order.domain.vaueobject.id.OrderId.class, this.OrderId));
        order.setDeliveryCompanyName(ValueObjectFactory.newInstance(DeliveryCompanyName.class, this.deliveryCompanyName));
    }
}
