package org.activite.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class DiscountTypeEvent {
    private DiscountTypeDto DiscountTypeDto;
}
