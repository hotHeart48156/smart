package org.product.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class ProductOriginalPriceEvent {
    private ProductOriginalPriceDto ProductOriginalPriceDto;
}
