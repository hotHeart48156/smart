package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class ProductSkuStockEvent {
    private org.product.dto.entity.ProductSkuStockDto ProductSkuStockDto;
}
