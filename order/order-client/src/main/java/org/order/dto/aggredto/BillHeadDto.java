package org.order.dto.aggredto;

import lombok.Data;
import org.order.domain.aggregation.Order;
import org.order.domain.vaueobject.BillHead;
import org.order.domain.vaueobject.ValueObjectFactory;

@Data
public class BillHeadDto {
    private String OrderId;
    private String billHead;

    public void accept(Order order) {
        order.setOrderId(ValueObjectFactory.newInstance(org.order.domain.vaueobject.id.OrderId.class, this.OrderId));
        order.setBillHead(ValueObjectFactory.newInstance(BillHead.class, this.billHead));
    }
}
