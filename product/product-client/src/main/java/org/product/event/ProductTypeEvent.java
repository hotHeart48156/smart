package org.product.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class ProductTypeEvent {
    private ProductTypeDto ProductTypeDto;
}
