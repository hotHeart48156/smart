package org.order.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.order.dto.aggredto.IntegrationDto;

@Value
@AllArgsConstructor
public class IntegrationEvent {
    private org.order.dto.aggredto.IntegrationDto IntegrationDto;
}
