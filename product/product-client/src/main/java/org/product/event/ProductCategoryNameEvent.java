package org.product.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class ProductCategoryNameEvent {
    private ProductCategoryNameDto ProductCategoryNameDto;
}
