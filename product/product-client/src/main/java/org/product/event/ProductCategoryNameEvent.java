package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.product.dto.aggre.product.ProductCategoryNameDto;

@Value
@AllArgsConstructor
public class ProductCategoryNameEvent {
    private org.product.dto.aggre.product.ProductCategoryNameDto ProductCategoryNameDto;
}
