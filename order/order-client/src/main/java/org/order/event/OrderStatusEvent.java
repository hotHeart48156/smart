package org.order.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class OrderStatusEvent {
    private OrderStatusDto OrderStatusDto;
}
