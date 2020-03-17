package org.users.domainevent.aggevent;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class NickNameEvent {
    private org.users.dto.agg.NickNameDto NickNameDto;
}
