package org.users.domain.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class UserCollectEvent {
    private UserCollectDto UserCollectDto;
}
