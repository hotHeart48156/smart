package org.activite.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class SmallTypeEvent   extends AbstractEvent {
    private org.activite.dto.agg.SmallTypeDto SmallTypeDto;
}
