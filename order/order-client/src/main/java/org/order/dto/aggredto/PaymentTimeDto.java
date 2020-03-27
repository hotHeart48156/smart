package org.order.dto.aggredto;

import lombok.Data;
import org.order.domain.aggregation.Order;
import org.order.domain.vaueobject.ValueObjectFactory;
import org.order.domain.vaueobject.time.PaymentTime;
import org.order.dto.AbstractDto;

@Data
public class PaymentTimeDto   extends AbstractDto {
    private String OrderId;
    private String paymentTime;

    public void accept(Order order) {
        order.setOrderId(ValueObjectFactory.newInstance(org.order.domain.vaueobject.id.OrderId.class, this.OrderId));
        order.setPaymentTime(ValueObjectFactory.newInstance(PaymentTime.class, this.paymentTime));
    }
}
