package org.order.dto.aggredto;

import lombok.Data;
import org.order.domain.aggregation.Order;
import org.order.domain.vaueobject.ValueObjectFactory;
import org.order.domain.vaueobject.name.ReceiverName;
import org.order.dto.AbstractDto;

@Data
public class ReceiverNameDto   extends AbstractDto {
    private String OrderId;
    private String receiverName;

    public void accept(Order order) {
        order.setOrderId(ValueObjectFactory.newInstance(org.order.domain.vaueobject.id.OrderId.class, this.OrderId));
        order.setReceiverName(ValueObjectFactory.newInstance(ReceiverName.class, this.receiverName));
    }
}
