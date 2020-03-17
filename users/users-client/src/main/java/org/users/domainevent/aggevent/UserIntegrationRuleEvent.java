package org.users.domainevent.aggevent;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class UserIntegrationRuleEvent {
    private org.users.dto.entity.UserIntegrationRuleDto UserIntegrationRuleDto;
}
