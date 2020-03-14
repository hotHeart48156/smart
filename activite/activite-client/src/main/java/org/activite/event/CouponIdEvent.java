package org.activite.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class CouponIdEvent {
    private CouponIdDto CouponIdDto;
}
