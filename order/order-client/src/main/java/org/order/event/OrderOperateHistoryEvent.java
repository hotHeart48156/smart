package org.order.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.order.dto.entitydto.OrderOperateHistoryDto;

@Value
@AllArgsConstructor
public class OrderOperateHistoryEvent {
    private org.order.dto.entitydto.OrderOperateHistoryDto OrderOperateHistoryDto;
}
