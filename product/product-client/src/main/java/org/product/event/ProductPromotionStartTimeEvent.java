package org.product.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class ProductPromotionStartTimeEvent {
    private ProductPromotionStartTimeDto ProductPromotionStartTimeDto;
}