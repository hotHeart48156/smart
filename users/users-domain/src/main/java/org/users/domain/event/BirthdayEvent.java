package org.users.domain.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class BirthdayEvent {
    private BirthdayDto BirthdayDto;
}
