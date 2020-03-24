package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.product.dto.aggre.product.ProductLogoDto;

@Value
@AllArgsConstructor
public class ProductLogoEvent {
    private org.product.dto.aggre.product.ProductLogoDto ProductLogoDto;
}
