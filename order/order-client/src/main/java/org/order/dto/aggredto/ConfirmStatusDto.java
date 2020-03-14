package org.order.dto.aggredto;

import lombok.Data;
import org.order.domain.aggregation.Order;
import org.order.domain.vaueobject.ValueObjectFactory;
import org.order.domain.vaueobject.status.ConfirmStatus;

@Data
public class ConfirmStatusDto {
    private String OrderId;
    private String confirmStatus;

    public void accept(Order order) {
        order.setOrderId(ValueObjectFactory.newInstance(org.order.domain.vaueobject.id.OrderId.class, this.OrderId));
        order.setConfirmStatus(ValueObjectFactory.newInstance(ConfirmStatus.class, this.confirmStatus));
    }
}
