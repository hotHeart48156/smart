package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class ProductPromotionPerLimitEvent {
    private org.product.dto.aggre.product.ProductPromotionPerLimitDto ProductPromotionPerLimitDto;
}
