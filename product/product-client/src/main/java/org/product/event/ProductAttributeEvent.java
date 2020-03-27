package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class ProductAttributeEvent {
    private org.product.dto.entity.ProductAttributeDto ProductAttributeDto;
}
