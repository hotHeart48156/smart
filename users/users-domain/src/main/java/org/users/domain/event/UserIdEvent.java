package org.users.domain.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class UserIdEvent {
    private UserIdDto UserIdDto;
}
