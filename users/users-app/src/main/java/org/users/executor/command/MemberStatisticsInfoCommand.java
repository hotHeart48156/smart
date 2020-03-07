package org.users.executor.command;

import lombok.Value;
import org.users.dto.entitydto.MemberStatisticsInfoDto;
@Value
public class MemberStatisticsInfoCommand  extends AbstractCommand
{
    private MemberStatisticsInfoDto memberStatisticsInfoDto;
}