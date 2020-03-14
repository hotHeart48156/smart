package org.order.dto.aggredto;

import lombok.Data;
import org.order.domain.aggregation.Order;
import org.order.domain.vaueobject.Integration;
import org.order.domain.vaueobject.ValueObjectFactory;

@Data
public class IntegrationDto {
    private String OrderId;
    private String useIntegration;

    public void accept(Order order) {
        order.setOrderId(ValueObjectFactory.newInstance(org.order.domain.vaueobject.id.OrderId.class, this.OrderId));
        order.setIntegration(ValueObjectFactory.newInstance(Integration.class, this.useIntegration));
    }
}
