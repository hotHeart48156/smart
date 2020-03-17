package org.users.domainevent.aggevent;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class GenderEvent {
    private org.users.dto.agg.GenderDto GenderDto;
}
