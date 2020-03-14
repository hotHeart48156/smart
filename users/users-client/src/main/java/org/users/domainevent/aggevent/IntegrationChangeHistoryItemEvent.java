package org.users.domainevent.aggevent;

import lombok.Value;

@Value
@AllArgsConstructor
public class IntegrationChangeHistoryItemEvent {
    private IntegrationChangeHistoryItemDto IntegrationChangeHistoryItemDto;
}
