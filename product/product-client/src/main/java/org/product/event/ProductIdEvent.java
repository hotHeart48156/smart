package org.product.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class ProductIdEvent {
    private ProductIdDto ProductIdDto;
}
