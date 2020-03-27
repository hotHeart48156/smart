package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class ProductPromotionEndTimeEvent {
    private org.product.dto.aggre.product.ProductPromotionEndTimeDto ProductPromotionEndTimeDto;
}
