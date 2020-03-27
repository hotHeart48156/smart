package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class ProductNameEvent {
    private org.product.dto.aggre.product.ProductNameDto ProductNameDto;
}
