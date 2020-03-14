package org.users.domain.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class MemberStatisticsInfoEvent {
    private MemberStatisticsInfoDto MemberStatisticsInfoDto;
}
