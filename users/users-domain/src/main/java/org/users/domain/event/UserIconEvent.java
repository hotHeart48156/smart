package org.users.domain.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class UserIconEvent {
    private UserIconDto UserIconDto;
}
