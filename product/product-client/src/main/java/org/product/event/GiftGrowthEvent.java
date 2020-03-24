package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.product.dto.aggre.product.GiftGrowthDto;

@Value
@AllArgsConstructor
public class GiftGrowthEvent {
    private org.product.dto.aggre.product.GiftGrowthDto GiftGrowthDto;
}
