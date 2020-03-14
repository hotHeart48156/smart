package org.users.domain.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class EntityEvent {
    private EntityDto EntityDto;
}
