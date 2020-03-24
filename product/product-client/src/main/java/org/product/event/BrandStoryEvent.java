package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.product.dto.aggre.brand.BrandStoryDto;

@Value
@AllArgsConstructor
public class BrandStoryEvent {
    private org.product.dto.aggre.brand.BrandStoryDto BrandStoryDto;
}
