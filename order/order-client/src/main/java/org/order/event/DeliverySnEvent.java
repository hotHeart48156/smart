package org.order.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.order.dto.aggredto.DeliverySnDto;

@Value
@AllArgsConstructor
public class DeliverySnEvent {
    private org.order.dto.aggredto.DeliverySnDto DeliverySnDto;
}
