package org.users.domain.command;

import lombok.Value;

@Value
public class AddressCommand {
    private org.user.domain.dto.entity.AddressDto AddressDto;
}
