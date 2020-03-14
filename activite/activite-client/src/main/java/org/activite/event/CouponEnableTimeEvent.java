package org.activite.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class CouponEnableTimeEvent {
    private CouponEnableTimeDto CouponEnableTimeDto;
}
