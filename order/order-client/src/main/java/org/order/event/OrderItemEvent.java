package org.order.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class OrderItemEvent {
    private OrderItemDto OrderItemDto;
}
