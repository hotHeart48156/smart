package org.product.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class PromotionTypeEvent {
    private PromotionTypeDto PromotionTypeDto;
}
