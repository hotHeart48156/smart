package  org.users.domainevent.entity;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class GrowthChangeHistoryItemEvent{
private org.users.dto.entity.GrowthChangeHistoryItemDto GrowthChangeHistoryItemDto;
}
