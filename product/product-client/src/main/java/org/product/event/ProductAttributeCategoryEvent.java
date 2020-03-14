package org.product.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class ProductAttributeCategoryEvent {
    private ProductAttributeCategoryDto ProductAttributeCategoryDto;
}
