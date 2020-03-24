package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.product.dto.aggre.product.ProductPromotionStartTimeDto;

@Value
@AllArgsConstructor
public class ProductPromotionStartTimeEvent {
    private org.product.dto.aggre.product.ProductPromotionStartTimeDto ProductPromotionStartTimeDto;
}
