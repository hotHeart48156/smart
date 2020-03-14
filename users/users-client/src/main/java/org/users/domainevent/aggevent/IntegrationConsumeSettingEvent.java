package org.users.domainevent.aggevent;

import lombok.Value;

@Value
@AllArgsConstructor
public class IntegrationConsumeSettingEvent {
    private IntegrationConsumeSettingDto IntegrationConsumeSettingDto;
}
