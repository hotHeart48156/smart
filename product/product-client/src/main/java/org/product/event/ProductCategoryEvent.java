package org.product.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class ProductCategoryEvent {
    private ProductCategoryDto ProductCategoryDto;
}
