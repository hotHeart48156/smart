package org.order.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.order.dto.aggredto.OrderStatusDto;

@Value
@AllArgsConstructor
public class OrderStatusEvent {
    private org.order.dto.aggredto.OrderStatusDto OrderStatusDto;
}
