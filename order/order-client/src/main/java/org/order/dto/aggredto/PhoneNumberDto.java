package org.order.dto.aggredto;

import org.order.domain.aggregation.Order;
import org.order.domain.vaueobject.ValueObjectFactory;
import org.order.domain.vaueobject.phone.PhoneNumber;
import org.order.dto.AbstractDto;

/**
 * @author "yangbiao"
 */

public class PhoneNumberDto   extends AbstractDto {
    private String orderId;
    private String phone;

    public void accept(Order order) {
        order.setReceiverPhone(ValueObjectFactory.newInstance(PhoneNumber.class, phone));
    }
}
