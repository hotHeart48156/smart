package org.activite.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class UserLevelEvent   extends AbstractEvent {
    private org.activite.dto.agg.marketing.UserLevelDto UserLevelDto;
}
