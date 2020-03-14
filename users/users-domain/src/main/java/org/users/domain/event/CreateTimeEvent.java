package org.users.domain.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class CreateTimeEvent {
    private CreateTimeDto CreateTimeDto;
}
