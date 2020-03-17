package org.users.domainevent.aggevent;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class UserNameEvent {
    private org.users.dto.agg.UserNameDto UserNameDto;
}
