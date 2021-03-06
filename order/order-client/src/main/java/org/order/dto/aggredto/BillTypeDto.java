package org.order.dto.aggredto;

import lombok.Data;
import org.order.domain.aggregation.Order;
import org.order.domain.vaueobject.ValueObjectFactory;
import org.order.domain.vaueobject.type.BillType;
import org.order.dto.AbstractDto;

@Data
public class BillTypeDto   extends AbstractDto {
    private String OrderId;
    private String billType;

    public void accept(Order order) {
        order.setOrderId(ValueObjectFactory.newInstance(org.order.domain.vaueobject.id.OrderId.class, this.OrderId));
        order.setBillType(ValueObjectFactory.newInstance(BillType.class, this.billType));
    }
}
