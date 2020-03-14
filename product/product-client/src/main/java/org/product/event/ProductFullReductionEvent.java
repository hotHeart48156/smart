package org.product.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class ProductFullReductionEvent {
    private ProductFullReductionDto ProductFullReductionDto;
}
