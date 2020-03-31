package org.order.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.order.dto.aggredto.GrowthDto;

@Value
@AllArgsConstructor
public class GrowthEvent {
    private org.order.dto.aggredto.GrowthDto GrowthDto;
}
