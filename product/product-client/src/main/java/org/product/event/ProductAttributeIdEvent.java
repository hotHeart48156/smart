package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class ProductAttributeIdEvent {
    private org.product.dto.aggre.product.ProductAttributeIdDto ProductAttributeIdDto;
}
