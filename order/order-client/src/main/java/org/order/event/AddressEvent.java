package org.order.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class AddressEvent {
    private org.order.dto.entitydto.AddressDto AddressDto;
}
