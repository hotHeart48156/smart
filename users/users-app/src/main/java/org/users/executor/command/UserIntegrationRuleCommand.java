package org.users.executor.command;

import lombok.Value;
import org.users.dto.entitydto.UserIntegrationRuleDto;

@Value
public class UserIntegrationRuleCommand  extends AbstractCommand
{
    UserIntegrationRuleDto userIntegrationRuleDto;
}