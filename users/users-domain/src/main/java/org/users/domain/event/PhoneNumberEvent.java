package org.users.domain.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class PhoneNumberEvent {
    private PhoneNumberDto PhoneNumberDto;
}
