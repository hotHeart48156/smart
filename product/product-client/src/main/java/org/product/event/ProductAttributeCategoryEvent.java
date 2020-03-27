package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class ProductAttributeCategoryEvent {
    private org.product.dto.entity.ProductAttributeCategoryDto ProductAttributeCategoryDto;
}
