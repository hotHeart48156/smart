package org.order.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class OrderReturnReasonEvent {
    private OrderReturnReasonDto OrderReturnReasonDto;
}
