package org.order.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class DeliveryMessageEvent {
    private org.order.dto.aggredto.DeliveryMessageDto DeliveryMessageDto;
}
