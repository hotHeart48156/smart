package org.activite.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class CouponCodeEvent {
    private CouponCodeDto CouponCodeDto;
}
