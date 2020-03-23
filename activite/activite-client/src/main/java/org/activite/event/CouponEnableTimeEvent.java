package org.activite.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class CouponEnableTimeEvent   extends AbstractEvent  {
    private org.activite.dto.agg.coupon.CouponEnableTimeDto CouponEnableTimeDto;
}
