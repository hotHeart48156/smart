package  org.users.domainevent.entity;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class MemberStatisticsInfoEvent{
private org.users.dto.entity.MemberStatisticsInfoDto MemberStatisticsInfoDto;
}
