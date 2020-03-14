package org.product.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class GiftsCategoryEvent {
    private GiftsCategoryDto GiftsCategoryDto;
}
