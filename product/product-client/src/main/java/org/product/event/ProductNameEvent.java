package org.product.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class ProductNameEvent {
    private ProductNameDto ProductNameDto;
}
