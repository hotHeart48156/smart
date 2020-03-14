package org.product.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class ProductPromotionPerLimitEvent {
    private ProductPromotionPerLimitDto ProductPromotionPerLimitDto;
}
