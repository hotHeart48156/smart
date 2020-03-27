package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class ProductStockEvent {
    private org.product.dto.aggre.product.ProductStockDto ProductStockDto;
}
