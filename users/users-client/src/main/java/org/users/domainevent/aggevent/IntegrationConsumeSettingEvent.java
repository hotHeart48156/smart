package org.users.domainevent.aggevent;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class IntegrationConsumeSettingEvent {
    private org.users.dto.entity.IntegrationConsumeSettingDto IntegrationConsumeSettingDto;
}
