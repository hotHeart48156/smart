package org.product.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class ProductLogoEvent {
    private ProductLogoDto ProductLogoDto;
}
