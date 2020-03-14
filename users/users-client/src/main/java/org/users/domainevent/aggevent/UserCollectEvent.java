package org.users.domainevent.aggevent;

import lombok.Value;

@Value
@AllArgsConstructor
public class UserCollectEvent {
    private UserCollectDto UserCollectDto;
}
