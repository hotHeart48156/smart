package org.activite.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class CouponCodeEvent   extends AbstractEvent  {
    private org.activite.dto.agg.CouponCodeDto CouponCodeDto;
}
