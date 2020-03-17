package org.users.domainevent.aggevent;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class IntegrationChangeHistoryItemEvent {
    private org.users.dto.entity.IntegrationChangeHistoryItemDto IntegrationChangeHistoryItemDto;
}
