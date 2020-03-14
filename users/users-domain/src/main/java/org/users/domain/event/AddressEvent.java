package org.users.domain.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class AddressEvent {
    private AddressDto AddressDto;
}
