package org.order.dto.aggredto;

import lombok.Data;
import org.order.domain.aggregation.Order;
import org.order.domain.vaueobject.BillContent;
import org.order.domain.vaueobject.ValueObjectFactory;
import org.order.dto.AbstractDto;

@Data
public class BillContentDto   extends AbstractDto {
    private String OrderId;
    private String billContent;

    public void accept(Order order) {
        order.setOrderId(ValueObjectFactory.newInstance(org.order.domain.vaueobject.id.OrderId.class, this.OrderId));
        order.setBillContent(ValueObjectFactory.newInstance(BillContent.class, this.billContent));
    }
}
