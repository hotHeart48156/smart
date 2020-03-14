package org.users.domainevent.aggevent;

import lombok.Value;

@Value
@AllArgsConstructor
public class GrowthChangeHistoryItemEvent {
    private GrowthChangeHistoryItemDto GrowthChangeHistoryItemDto;
}
