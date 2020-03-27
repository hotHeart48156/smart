package org.order.dto.aggredto;

import lombok.Data;
import org.order.domain.aggregation.Order;
import org.order.domain.vaueobject.ValueObjectFactory;
import org.order.domain.vaueobject.name.DeliveryCompanyName;
import org.order.dto.AbstractDto;

@Data
public class DeliveryCompanyNameDto   extends AbstractDto {
    private String OrderId;
    private String deliveryCompanyName;

    public void accept(Order order) {
        order.setOrderId(ValueObjectFactory.newInstance(org.order.domain.vaueobject.id.OrderId.class, this.OrderId));
        order.setDeliveryCompanyName(ValueObjectFactory.newInstance(DeliveryCompanyName.class, this.deliveryCompanyName));
    }
}
