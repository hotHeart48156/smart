package org.activite.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class UserLevelEvent   extends AbstractEvent {
    private org.activite.dto.agg.UserLevelDto UserLevelDto;
}
