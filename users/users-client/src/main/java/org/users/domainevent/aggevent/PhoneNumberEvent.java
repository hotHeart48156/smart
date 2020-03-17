package org.users.domainevent.aggevent;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class PhoneNumberEvent {
    private org.users.dto.agg.PhoneNumberDto PhoneNumberDto;
}
