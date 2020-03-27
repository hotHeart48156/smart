package org.order.executor.command;

import lombok.Value;
import org.order.dto.entitydto.CartItemDto;
@Value
public class CartItemCommand  extends AbstractCommand{
private CartItemDto  CartItemDto;
}
