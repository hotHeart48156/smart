package org.product.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class ProductAttributeEvent {
    private ProductAttributeDto ProductAttributeDto;
}
