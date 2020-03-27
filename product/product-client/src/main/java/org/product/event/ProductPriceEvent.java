package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class ProductPriceEvent {
    private org.product.dto.aggre.product.ProductPriceDto ProductPriceDto;
}
