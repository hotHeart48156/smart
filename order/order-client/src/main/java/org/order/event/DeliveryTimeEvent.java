package org.order.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.order.dto.aggredto.DeliveryTimeDto;

@Value
@AllArgsConstructor
public class DeliveryTimeEvent {
    private org.order.dto.aggredto.DeliveryTimeDto DeliveryTimeDto;
}
