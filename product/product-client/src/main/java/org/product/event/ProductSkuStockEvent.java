package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.product.dto.entity.ProductSkuStockDto;

@Value
@AllArgsConstructor
public class ProductSkuStockEvent {
    private org.product.dto.entity.ProductSkuStockDto ProductSkuStockDto;
}
