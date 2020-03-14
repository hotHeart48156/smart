package org.users.domain.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class UserNameEvent {
    private UserNameDto UserNameDto;
}
