package org.product.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class ProductCountEvent {
    private ProductCountDto ProductCountDto;
}
