package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.product.dto.aggre.product.ProductStockDto;

@Value
@AllArgsConstructor
public class ProductStockEvent {
    private org.product.dto.aggre.product.ProductStockDto ProductStockDto;
}
