package org.order.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class PhoneNumberEvent {
    private org.order.dto.aggredto.PhoneNumberDto PhoneNumberDto;
}
