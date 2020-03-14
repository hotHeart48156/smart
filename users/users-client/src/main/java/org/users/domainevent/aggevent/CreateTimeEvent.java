package org.users.domainevent.aggevent;

import lombok.Value;

@Value
@AllArgsConstructor
public class CreateTimeEvent {
    private CreateTimeDto CreateTimeDto;
}
