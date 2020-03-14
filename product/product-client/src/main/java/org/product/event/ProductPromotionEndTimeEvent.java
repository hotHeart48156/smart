package org.product.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class ProductPromotionEndTimeEvent {
    private ProductPromotionEndTimeDto ProductPromotionEndTimeDto;
}
