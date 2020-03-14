package org.order.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class OrderTypeEvent {
    private OrderTypeDto OrderTypeDto;
}
