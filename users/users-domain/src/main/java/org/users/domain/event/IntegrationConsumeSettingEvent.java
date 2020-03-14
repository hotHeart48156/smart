package org.users.domain.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class IntegrationConsumeSettingEvent {
    private IntegrationConsumeSettingDto IntegrationConsumeSettingDto;
}
