package org.order.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class AddressIdEvent {
    private org.order.dto.aggredto.AddressIdDto AddressIdDto;
}
