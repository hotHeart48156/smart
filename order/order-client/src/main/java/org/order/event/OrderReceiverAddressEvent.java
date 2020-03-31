package org.order.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.order.dto.aggredto.OrderReceiverAddressDto;

@Value
@AllArgsConstructor
public class OrderReceiverAddressEvent {
    private org.order.dto.aggredto.OrderReceiverAddressDto OrderReceiverAddressDto;
}
