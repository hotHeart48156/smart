package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class ProductOriginalPriceEvent {
    private org.product.dto.aggre.product.ProductOriginalPriceDto ProductOriginalPriceDto;
}
