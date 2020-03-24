package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.product.dto.entity.ProductAttributeCategoryDto;

@Value
@AllArgsConstructor
public class ProductAttributeCategoryEvent {
    private org.product.dto.entity.ProductAttributeCategoryDto ProductAttributeCategoryDto;
}
