package org.product.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class GiftPointEvent {
    private GiftPointDto GiftPointDto;
}
