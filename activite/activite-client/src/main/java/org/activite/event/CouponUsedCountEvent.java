package org.activite.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class CouponUsedCountEvent {
    private CouponUsedCountDto CouponUsedCountDto;
}
