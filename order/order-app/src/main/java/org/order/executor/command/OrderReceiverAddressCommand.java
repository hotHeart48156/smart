package org.order.executor.command;

import lombok.Value;
import org.order.dto.aggredto.OrderReceiverAddressDto;

@Value
public class OrderReceiverAddressCommand  extends AbstractCommand{
private OrderReceiverAddressDto  OrderReceiverAddressDto;
}
