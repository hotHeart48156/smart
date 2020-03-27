package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class ProductPromotionStartTimeEvent {
    private org.product.dto.aggre.product.ProductPromotionStartTimeDto ProductPromotionStartTimeDto;
}
