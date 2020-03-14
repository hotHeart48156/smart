package org.order.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class OrderDeleteStatusEvent {
    private OrderDeleteStatusDto OrderDeleteStatusDto;
}
