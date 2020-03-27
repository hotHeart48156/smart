package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class ProductCategoryIdEvent {
    private org.product.dto.aggre.product.ProductCategoryIdDto ProductCategoryIdDto;
}
