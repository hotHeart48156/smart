package org.product.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class ProductAttributeCategoryIdEvent {
    private ProductAttributeCategoryIdDto ProductAttributeCategoryIdDto;
}
