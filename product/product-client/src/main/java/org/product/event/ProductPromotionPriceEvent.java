package org.product.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class ProductPromotionPriceEvent {
    private ProductPromotionPriceDto ProductPromotionPriceDto;
}
