package org.order.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class CartItemEvent {
    private org.order.dto.entitydto.CartItemDto CartItemDto;
}
