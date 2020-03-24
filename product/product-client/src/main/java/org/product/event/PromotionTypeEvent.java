package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.product.dto.aggre.product.PromotionTypeDto;

@Value
@AllArgsConstructor
public class PromotionTypeEvent {
    private org.product.dto.aggre.product.PromotionTypeDto PromotionTypeDto;
}
