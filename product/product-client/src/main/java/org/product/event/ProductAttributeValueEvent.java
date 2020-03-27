package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class ProductAttributeValueEvent {
    private org.product.dto.entity.ProductAttributeValueDto ProductAttributeValueDto;
}
