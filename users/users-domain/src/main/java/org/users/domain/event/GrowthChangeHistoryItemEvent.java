package org.users.domain.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class GrowthChangeHistoryItemEvent {
    private GrowthChangeHistoryItemDto GrowthChangeHistoryItemDto;
}
