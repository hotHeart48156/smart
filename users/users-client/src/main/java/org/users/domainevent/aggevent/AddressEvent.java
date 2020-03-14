package org.users.domainevent.aggevent;

import lombok.Value;

@Value
@AllArgsConstructor
public class AddressEvent {
    private AddressDto AddressDto;
}
