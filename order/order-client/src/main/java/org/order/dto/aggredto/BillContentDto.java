package org.order.dto.aggredto;

import lombok.Data;
import org.order.domain.aggregation.Order;
import org.order.domain.vaueobject.BillContent;
import org.order.domain.vaueobject.ValueObjectFactory;

@Data
public class BillContentDto {
    private String OrderId;
    private String billContent;

    public void accept(Order order) {
        order.setOrderId(ValueObjectFactory.newInstance(org.order.domain.vaueobject.id.OrderId.class, this.OrderId));
        order.setBillContent(ValueObjectFactory.newInstance(BillContent.class, this.billContent));
    }
}
