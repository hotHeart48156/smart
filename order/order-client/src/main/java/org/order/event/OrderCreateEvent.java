package org.order.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class OrderCreateEvent {
    private OrderCreateDto OrderCreateDto;
}
