package org.order.dto.aggredto;

import lombok.Data;
import org.order.domain.aggregation.Order;
import org.order.domain.vaueobject.ValueObjectFactory;
import org.order.domain.vaueobject.time.AutoConfirmTime;

@Data
public class AutoConfirmTimeDto {
    private String OrderId;
    private String autoConfirmTime;

    public void accept(Order order) {
        order.setOrderId(ValueObjectFactory.newInstance(org.order.domain.vaueobject.id.OrderId.class, this.OrderId));
        order.setAutoConfirmTime(ValueObjectFactory.newInstance(AutoConfirmTime.class, this.autoConfirmTime));
    }
}
