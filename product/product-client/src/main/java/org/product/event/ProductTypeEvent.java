package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.product.dto.aggre.product.ProductTypeDto;

@Value
@AllArgsConstructor
public class ProductTypeEvent {
    private org.product.dto.aggre.product.ProductTypeDto ProductTypeDto;
}
