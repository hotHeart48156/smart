package org.users.domainevent.aggevent;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class UserIconEvent {
    private org.users.dto.agg.UserIconDto UserIconDto;
}
