package org.activite.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class CouponPublishCountEvent   extends AbstractEvent  {
    private org.activite.dto.agg.coupon.CouponPublishCountDto CouponPublishCountDto;
}
