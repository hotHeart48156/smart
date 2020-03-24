package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.product.dto.entity.ProductAttributeValueDto;

@Value
@AllArgsConstructor
public class ProductAttributeValueEvent {
    private org.product.dto.entity.ProductAttributeValueDto ProductAttributeValueDto;
}
