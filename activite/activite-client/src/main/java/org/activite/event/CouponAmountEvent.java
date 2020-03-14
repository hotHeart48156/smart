package org.activite.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class CouponAmountEvent {
    private CouponAmountDto CouponAmountDto;
}
