package org.product.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class ProductPicEvent {
    private ProductPicDto ProductPicDto;
}
