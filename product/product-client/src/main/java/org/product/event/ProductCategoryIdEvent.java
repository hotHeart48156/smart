package org.product.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class ProductCategoryIdEvent {
    private ProductCategoryIdDto ProductCategoryIdDto;
}
