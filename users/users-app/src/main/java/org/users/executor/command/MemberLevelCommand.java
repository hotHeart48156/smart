package org.users.executor.command;

import lombok.Value;
import org.users.dto.entitydto.MemberLevelDto;

@Value
public class MemberLevelCommand  extends AbstractCommand
{
    private MemberLevelDto memberLevelDto;
}