package org.activite.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class CreateTimeEvent {
    private CreateTimeDto CreateTimeDto;
}
