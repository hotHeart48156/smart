package org.users.domainevent.aggevent;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class WeixinOpenIdEvent {
    private org.users.dto.agg.WeixinOpenIdDto WeixinOpenIdDto;
}
