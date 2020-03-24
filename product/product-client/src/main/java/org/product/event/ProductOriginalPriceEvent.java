package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.product.dto.aggre.product.ProductOriginalPriceDto;

@Value
@AllArgsConstructor
public class ProductOriginalPriceEvent {
    private org.product.dto.aggre.product.ProductOriginalPriceDto ProductOriginalPriceDto;
}
