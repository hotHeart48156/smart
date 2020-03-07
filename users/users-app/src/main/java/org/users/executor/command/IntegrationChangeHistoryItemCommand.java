package org.users.executor.command;

import lombok.Value;
import org.users.dto.entitydto.IntegrationChangeHistoryItemDto;

@Value
public class IntegrationChangeHistoryItemCommand  extends AbstractCommand
{
    private IntegrationChangeHistoryItemDto changeHistoryItemDto;
}