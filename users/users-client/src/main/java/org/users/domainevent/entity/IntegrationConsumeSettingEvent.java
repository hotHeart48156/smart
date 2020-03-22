package  org.users.domainevent.entity;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class IntegrationConsumeSettingEvent{
private org.users.dto.entity.IntegrationConsumeSettingDto IntegrationConsumeSettingDto;
}
