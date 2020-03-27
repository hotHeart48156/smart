package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class BrandStoryEvent {
    private org.product.dto.aggre.brand.BrandStoryDto BrandStoryDto;
}
