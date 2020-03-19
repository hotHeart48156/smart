package org.activite.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class ActivityUserEvent   extends AbstractEvent {
    private org.activite.dto.agg.ActivityUserDto ActivityUserDto;
}
