package org.activite.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class CouponUserTypeEvent {
    private CouponUserTypeDto CouponUserTypeDto;
}
