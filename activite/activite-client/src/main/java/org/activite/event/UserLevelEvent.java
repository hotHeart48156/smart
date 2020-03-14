package org.activite.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class UserLevelEvent {
    private UserLevelDto UserLevelDto;
}
