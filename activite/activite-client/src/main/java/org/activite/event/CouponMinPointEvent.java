package org.activite.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class CouponMinPointEvent {
    private CouponMinPointDto CouponMinPointDto;
}