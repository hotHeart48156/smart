package org.product.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class EntityEvent {
    private EntityDto EntityDto;
}
