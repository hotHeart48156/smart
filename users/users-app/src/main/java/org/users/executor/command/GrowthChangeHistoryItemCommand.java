package org.users.executor.command;

import lombok.Value;
import org.users.dto.entitydto.GrowthChangeHistoryItemDto;

@Value
public class GrowthChangeHistoryItemCommand  extends AbstractCommand
{
    GrowthChangeHistoryItemDto changeHistoryItemDto;
}