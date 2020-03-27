package org.order.executor.command;

import lombok.Value;
import org.order.dto.aggredto.OrderStatusDto;

@Value
public class OrderStatusCommand  extends AbstractCommand{
private OrderStatusDto  OrderStatusDto;
}
