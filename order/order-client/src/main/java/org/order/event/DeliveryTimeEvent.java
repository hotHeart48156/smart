package org.order.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class DeliveryTimeEvent {
    private DeliveryTimeDto DeliveryTimeDto;
}
