package org.order.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class OrderOperateHistoryEvent {
    private OrderOperateHistoryDto OrderOperateHistoryDto;
}
