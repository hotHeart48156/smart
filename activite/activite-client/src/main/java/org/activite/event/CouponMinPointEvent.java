package org.activite.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class CouponMinPointEvent   extends AbstractEvent  {
    private org.activite.dto.agg.coupon.CouponMinPointDto CouponMinPointDto;
}
