package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class ProductSalesQualitityEvent {
    private org.product.dto.aggre.product.ProductSalesQualitityDto ProductSalesQualitityDto;
}
