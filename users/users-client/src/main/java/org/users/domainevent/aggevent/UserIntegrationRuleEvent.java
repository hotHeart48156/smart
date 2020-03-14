package org.users.domainevent.aggevent;

import lombok.Value;

@Value
@AllArgsConstructor
public class UserIntegrationRuleEvent {
    private UserIntegrationRuleDto UserIntegrationRuleDto;
}
