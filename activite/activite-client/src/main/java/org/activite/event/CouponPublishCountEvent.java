package org.activite.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class CouponPublishCountEvent {
    private CouponPublishCountDto CouponPublishCountDto;
}
