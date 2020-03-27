package org.order.executor.command;

import lombok.Value;
import org.order.dto.entitydto.OrderItemDto;
@Value
public class OrderItemCommand  extends AbstractCommand{
private OrderItemDto  OrderItemDto;
}
