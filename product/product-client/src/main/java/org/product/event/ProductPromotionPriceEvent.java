package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.product.dto.aggre.product.ProductPromotionPriceDto;

@Value
@AllArgsConstructor
public class ProductPromotionPriceEvent {
    private org.product.dto.aggre.product.ProductPromotionPriceDto ProductPromotionPriceDto;
}
