package org.users.domainevent.aggevent;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class GrowthChangeHistoryItemEvent {
    private org.users.dto.entity.GrowthChangeHistoryItemDto GrowthChangeHistoryItemDto;
}
