package org.activite.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class CouponHistoryEvent   extends AbstractEvent  {
    private org.activite.dto.entity.CouponHistoryDto CouponHistoryDto;
}
