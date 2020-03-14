package org.users.domain.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class IntegrationEvent {
    private IntegrationDto IntegrationDto;
}
