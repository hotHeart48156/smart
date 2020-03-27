package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class ProductAttributeCategoryIdEvent {
    private org.product.dto.aggre.product.ProductAttributeCategoryIdDto ProductAttributeCategoryIdDto;
}
