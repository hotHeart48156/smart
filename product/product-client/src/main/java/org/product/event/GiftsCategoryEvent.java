package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.product.dto.entity.GiftsCategoryDto;

@Value
@AllArgsConstructor
public class GiftsCategoryEvent {
    private org.product.dto.entity.GiftsCategoryDto GiftsCategoryDto;
}
