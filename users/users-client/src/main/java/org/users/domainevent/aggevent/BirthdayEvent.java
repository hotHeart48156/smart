package org.users.domainevent.aggevent;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class BirthdayEvent {
    private org.users.dto.agg.BirthdayDto BirthdayDto;
}
