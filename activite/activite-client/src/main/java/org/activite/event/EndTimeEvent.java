package org.activite.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class EndTimeEvent {
    private EndTimeDto EndTimeDto;
}
