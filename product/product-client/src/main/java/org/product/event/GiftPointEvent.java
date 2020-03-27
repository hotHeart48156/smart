package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class GiftPointEvent {
    private org.product.dto.aggre.product.GiftPointDto GiftPointDto;
}
