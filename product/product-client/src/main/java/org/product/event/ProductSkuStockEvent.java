package org.product.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class ProductSkuStockEvent {
    private ProductSkuStockDto ProductSkuStockDto;
}
