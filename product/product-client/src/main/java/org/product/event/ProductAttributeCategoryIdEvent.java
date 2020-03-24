package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.product.dto.aggre.product.ProductAttributeCategoryIdDto;

@Value
@AllArgsConstructor
public class ProductAttributeCategoryIdEvent {
    private org.product.dto.aggre.product.ProductAttributeCategoryIdDto ProductAttributeCategoryIdDto;
}
