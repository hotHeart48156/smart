package org.users.domainevent.aggevent;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class IntegrationEvent {
    private org.users.dto.agg.IntegrationDto IntegrationDto;
}
