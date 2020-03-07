package org.users.executor.command;

import lombok.Value;
import org.users.dto.entitydto.UserCollectDto;

@Value
public class UserCollectCommand  extends AbstractCommand
{
    UserCollectDto userCollectDto;
}