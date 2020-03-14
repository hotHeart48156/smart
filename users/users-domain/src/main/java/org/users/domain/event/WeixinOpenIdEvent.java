package org.users.domain.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class WeixinOpenIdEvent {
    private WeixinOpenIdDto WeixinOpenIdDto;
}
