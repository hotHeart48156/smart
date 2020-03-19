package org.activite.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class CouponNameEvent   extends AbstractEvent  {
    private org.activite.dto.agg.CouponNameDto CouponNameDto;
}
