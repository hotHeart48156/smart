package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.product.dto.aggre.product.ProductPromotionPerLimitDto;

@Value
@AllArgsConstructor
public class ProductPromotionPerLimitEvent {
    private org.product.dto.aggre.product.ProductPromotionPerLimitDto ProductPromotionPerLimitDto;
}
