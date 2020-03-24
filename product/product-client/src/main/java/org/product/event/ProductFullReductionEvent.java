package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.product.dto.entity.ProductFullReductionDto;

@Value
@AllArgsConstructor
public class ProductFullReductionEvent {
    private org.product.dto.entity.ProductFullReductionDto ProductFullReductionDto;
}
