package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class PromotionTypeEvent {
    private org.product.dto.aggre.product.PromotionTypeDto PromotionTypeDto;
}
