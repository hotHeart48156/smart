package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class ProductPromotionPriceEvent {
    private org.product.dto.aggre.product.ProductPromotionPriceDto ProductPromotionPriceDto;
}
