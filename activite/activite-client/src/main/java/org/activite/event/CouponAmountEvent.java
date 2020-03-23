package org.activite.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class CouponAmountEvent {
    private org.activite.dto.agg.coupon.CouponAmountDto CouponAmountDto;
}
