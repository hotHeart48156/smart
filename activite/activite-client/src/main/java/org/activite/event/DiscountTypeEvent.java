package org.activite.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class DiscountTypeEvent  extends AbstractEvent {
    private org.activite.dto.agg.marketing.DiscountTypeDto DiscountTypeDto;
}
