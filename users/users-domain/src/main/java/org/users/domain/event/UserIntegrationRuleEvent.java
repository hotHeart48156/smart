package org.users.domain.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class UserIntegrationRuleEvent {
    private UserIntegrationRuleDto UserIntegrationRuleDto;
}
