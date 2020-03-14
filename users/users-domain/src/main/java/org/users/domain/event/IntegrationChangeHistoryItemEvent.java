package org.users.domain.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class IntegrationChangeHistoryItemEvent {
    private IntegrationChangeHistoryItemDto IntegrationChangeHistoryItemDto;
}
