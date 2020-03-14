package org.product.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class ProductPriceEvent {
    private ProductPriceDto ProductPriceDto;
}
