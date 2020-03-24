package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.product.dto.entity.ProductAttributeDto;

@Value
@AllArgsConstructor
public class ProductAttributeEvent {
    private org.product.dto.entity.ProductAttributeDto ProductAttributeDto;
}
