package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class ProductFullReductionEvent {
    private org.product.dto.entity.ProductFullReductionDto ProductFullReductionDto;
}
