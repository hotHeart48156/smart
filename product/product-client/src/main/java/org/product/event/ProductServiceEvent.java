package org.product.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class ProductServiceEvent {
    private ProductServiceDto ProductServiceDto;
}
