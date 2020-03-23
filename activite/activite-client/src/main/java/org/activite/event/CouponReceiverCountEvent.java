package org.activite.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class CouponReceiverCountEvent   extends AbstractEvent  {
    private org.activite.dto.agg.coupon.CouponReceiverCountDto CouponReceiverCountDto;
}
