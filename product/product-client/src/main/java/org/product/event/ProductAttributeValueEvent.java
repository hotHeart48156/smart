package org.product.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class ProductAttributeValueEvent {
    private ProductAttributeValueDto ProductAttributeValueDto;
}
