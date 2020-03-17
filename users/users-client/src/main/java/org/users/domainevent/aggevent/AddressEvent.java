package org.users.domainevent.aggevent;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class AddressEvent {
    private org.users.dto.entity.AddressDto AddressDto;
}
