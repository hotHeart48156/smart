package org.order.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.order.dto.entitydto.OrderItemDto;

@Value
@AllArgsConstructor
public class OrderItemEvent {
    private org.order.dto.entitydto.OrderItemDto OrderItemDto;
}
