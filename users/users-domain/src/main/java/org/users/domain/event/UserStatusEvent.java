package org.users.domain.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class UserStatusEvent {
    private UserStatusDto UserStatusDto;
}
