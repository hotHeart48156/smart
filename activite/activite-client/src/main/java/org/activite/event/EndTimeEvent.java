package org.activite.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class EndTimeEvent extends AbstractEvent  {
    private org.activite.dto.agg.EndTimeDto EndTimeDto;
}
