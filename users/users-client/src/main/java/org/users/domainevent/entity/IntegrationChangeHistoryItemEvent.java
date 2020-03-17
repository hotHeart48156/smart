package  org.users.domainevent.entity;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class IntegrationChangeHistoryItemEvent{
private org.users.dto.entity.IntegrationChangeHistoryItemDto IntegrationChangeHistoryItemDto;
}
