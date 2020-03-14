package org.product.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class ProductSnEvent {
    private ProductSnDto ProductSnDto;
}
