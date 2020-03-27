package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class GiftsCategoryEvent {
    private org.product.dto.entity.GiftsCategoryDto GiftsCategoryDto;
}
