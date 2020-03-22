package  org.users.executor.command.entity;

import lombok.Value;

import org.users.executor.AbstractCommand;
@Value
public class MemberStatisticsInfoCommand  extends AbstractCommand {
private org.users.dto.entity.MemberStatisticsInfoDto MemberStatisticsInfoDto;
}
