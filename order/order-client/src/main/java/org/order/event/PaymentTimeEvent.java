package org.order.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class PaymentTimeEvent {
    private org.order.dto.aggredto.PaymentTimeDto PaymentTimeDto;
}
