package org.users.domain.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class GrowthEvent {
    private GrowthDto GrowthDto;
}
