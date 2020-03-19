package org.activite.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class CouponUsedCountEvent   extends AbstractEvent  {
    private org.activite.dto.agg.CouponUsedCountDto CouponUsedCountDto;
}
