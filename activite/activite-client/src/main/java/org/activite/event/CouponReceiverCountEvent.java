package org.activite.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class CouponReceiverCountEvent {
    private CouponReceiverCountDto CouponReceiverCountDto;
}
