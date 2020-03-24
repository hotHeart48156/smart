package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.product.dto.aggre.product.ProductNameDto;

@Value
@AllArgsConstructor
public class ProductNameEvent {
    private org.product.dto.aggre.product.ProductNameDto ProductNameDto;
}
