package org.order.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class OrderReturnApplyEvent {
    private OrderReturnApplyDto OrderReturnApplyDto;
}
