package org.activite.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class CouponHistoryEvent {
    private CouponHistoryDto CouponHistoryDto;
}
