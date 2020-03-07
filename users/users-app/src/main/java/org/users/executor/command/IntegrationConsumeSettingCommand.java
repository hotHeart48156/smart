package org.users.executor.command;

import lombok.Value;
import org.users.domain.entity.IntegrationConsumeSetting;
import org.users.dto.entitydto.IntegrationConsumeSettingDto;

@Value
public class IntegrationConsumeSettingCommand  extends AbstractCommand
{
    private IntegrationConsumeSettingDto consumeSettingDto;
}