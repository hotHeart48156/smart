package org.activite.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class StartTimeEvent {
    private StartTimeDto StartTimeDto;
}
