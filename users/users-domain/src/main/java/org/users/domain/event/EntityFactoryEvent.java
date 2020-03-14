package org.users.domain.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class EntityFactoryEvent {
    private EntityFactoryDto EntityFactoryDto;
}
