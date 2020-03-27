package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class GiftGrowthEvent {
    private org.product.dto.aggre.product.GiftGrowthDto GiftGrowthDto;
}
