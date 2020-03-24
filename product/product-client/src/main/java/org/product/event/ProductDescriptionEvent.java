package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.product.dto.aggre.product.ProductDescriptionDto;

@Value
@AllArgsConstructor
public class ProductDescriptionEvent {
    private org.product.dto.aggre.product.ProductDescriptionDto ProductDescriptionDto;
}
