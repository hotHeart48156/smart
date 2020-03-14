package org.users.domainevent.aggevent;

import lombok.Value;

@Value
@AllArgsConstructor
public class UserStatusEvent {
    private UserStatusDto UserStatusDto;
}
