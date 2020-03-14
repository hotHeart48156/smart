package org.activite.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class SendTimeEvent {
    private SendTimeDto SendTimeDto;
}
