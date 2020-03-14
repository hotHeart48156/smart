package org.order.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class OrderReceiverAddressEvent {
    private OrderReceiverAddressDto OrderReceiverAddressDto;
}
