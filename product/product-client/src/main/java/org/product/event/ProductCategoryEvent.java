package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.product.dto.entity.ProductCategoryDto;

@Value
@AllArgsConstructor
public class ProductCategoryEvent {
    private org.product.dto.entity.ProductCategoryDto ProductCategoryDto;
}
