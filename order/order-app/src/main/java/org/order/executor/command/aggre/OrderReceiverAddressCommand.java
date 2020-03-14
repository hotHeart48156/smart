package org.order.executor.command.aggre;

import lombok.Value;

@Value
public class OrderReceiverAddressCommand {
    private org.order.dto.aggredto.OrderReceiverAddressDto OrderReceiverAddressDto;
}
