package org.order.dto.aggredto;

import lombok.Data;
import org.order.domain.aggregation.Order;
import org.order.domain.vaueobject.ValueObjectFactory;
import org.order.domain.vaueobject.sn.DeliverySn;
import org.order.dto.AbstractDto;

@Data
public class DeliverySnDto   extends AbstractDto {
    private String OrderId;
    private String deliverySn;

    public void accept(Order order) {
        order.setOrderId(ValueObjectFactory.newInstance(org.order.domain.vaueobject.id.OrderId.class, this.OrderId));
        order.setDeliverySn(ValueObjectFactory.newInstance(DeliverySn.class, this.deliverySn));
    }
}
