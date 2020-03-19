package org.activite.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class CouponTypeEvent    extends AbstractEvent {
    private org.activite.dto.agg.CouponTypeDto CouponTypeDto;
}
