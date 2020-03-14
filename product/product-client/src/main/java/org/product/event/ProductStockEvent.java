package org.product.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class ProductStockEvent {
    private ProductStockDto ProductStockDto;
}
