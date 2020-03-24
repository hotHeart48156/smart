package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.product.dto.aggre.product.ProductPromotionEndTimeDto;

@Value
@AllArgsConstructor
public class ProductPromotionEndTimeEvent {
    private org.product.dto.aggre.product.ProductPromotionEndTimeDto ProductPromotionEndTimeDto;
}
