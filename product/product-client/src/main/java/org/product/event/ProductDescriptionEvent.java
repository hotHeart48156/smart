package org.product.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class ProductDescriptionEvent {
    private ProductDescriptionDto ProductDescriptionDto;
}
