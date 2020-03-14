package org.product.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class FactoryStatusEvent {
    private FactoryStatusDto FactoryStatusDto;
}
