package org.product.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class GiftGrowthEvent {
    private GiftGrowthDto GiftGrowthDto;
}
