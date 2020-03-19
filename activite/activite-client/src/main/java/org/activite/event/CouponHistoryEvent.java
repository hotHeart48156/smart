package org.activite.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class CouponHistoryEvent {
    private org.activite.dto.entity.CouponHistoryDto CouponHistoryDto;
}
  extends AbstractEvent   extends AbstractEvent 