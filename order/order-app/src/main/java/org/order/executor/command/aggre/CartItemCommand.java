package org.order.executor.command.aggre;

import lombok.Value;

@Value
public class CartItemCommand {
    private org.order.dto.entitydto.CartItemDto CartItemDto;
}
