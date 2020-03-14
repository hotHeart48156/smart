package org.activite.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class ActivityUserEvent {
    private ActivityUserDto ActivityUserDto;
}
