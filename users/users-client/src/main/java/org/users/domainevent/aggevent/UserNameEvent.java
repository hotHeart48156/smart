package org.users.domainevent.aggevent;

import lombok.Value;

@Value
@AllArgsConstructor
public class UserNameEvent {
    private UserNameDto UserNameDto;
}
