package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class ProductTypeEvent {
    private org.product.dto.aggre.product.ProductTypeDto ProductTypeDto;
}
