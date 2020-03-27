package org.order.executor.command;
import lombok.Value;

@Value
public class OrderCreateCommand  extends AbstractCommand{
private OrderCreateDto  OrderCreateDto;
}
