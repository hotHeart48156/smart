package org.users.domainevent.aggevent;

import lombok.Value;

@Value
@AllArgsConstructor
public class MemberStatisticsInfoEvent {
    private MemberStatisticsInfoDto MemberStatisticsInfoDto;
}
