package org.users.domainevent.aggevent;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class UserStatusEvent {
    private org.users.dto.agg.UserStatusDto UserStatusDto;
}
