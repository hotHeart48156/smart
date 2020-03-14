package org.order.dto.aggredto;

import lombok.Data;
import org.order.domain.aggregation.Order;
import org.order.domain.vaueobject.Growth;
import org.order.domain.vaueobject.ValueObjectFactory;

@Data
public class GrowthDto {
    private String OrderId;
    private String growth;

    public void accept(Order order) {
        order.setOrderId(ValueObjectFactory.newInstance(org.order.domain.vaueobject.id.OrderId.class, this.OrderId));
        order.setGrowth(ValueObjectFactory.newInstance(Growth.class, this.growth));
    }
}
