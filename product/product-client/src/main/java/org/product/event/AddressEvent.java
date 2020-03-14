package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class AddressEvent {
    private org.product.dtoo.dto.AddressDto AddressDto;
}
