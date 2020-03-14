package org.product.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class ProductAttributeIdEvent {
    private ProductAttributeIdDto ProductAttributeIdDto;
}
