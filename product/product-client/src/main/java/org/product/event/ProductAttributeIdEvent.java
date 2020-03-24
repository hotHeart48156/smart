package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.product.dto.aggre.product.ProductAttributeIdDto;

@Value
@AllArgsConstructor
public class ProductAttributeIdEvent {
    private org.product.dto.aggre.product.ProductAttributeIdDto ProductAttributeIdDto;
}
