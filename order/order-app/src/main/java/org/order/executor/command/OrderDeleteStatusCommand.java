package org.order.executor.command;

import lombok.Value;
import org.order.dto.aggredto.OrderDeleteStatusDto;

@Value
public class OrderDeleteStatusCommand  extends AbstractCommand{
private OrderDeleteStatusDto  OrderDeleteStatusDto;
}
