package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.product.dto.aggre.product.ProductPriceDto;

@Value
@AllArgsConstructor
public class ProductPriceEvent {
    private org.product.dto.aggre.product.ProductPriceDto ProductPriceDto;
}
