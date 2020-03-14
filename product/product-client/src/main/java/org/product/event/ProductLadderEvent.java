package org.product.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class ProductLadderEvent {
    private ProductLadderDto ProductLadderDto;
}
