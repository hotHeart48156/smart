package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class ProductLadderEvent {
    private org.product.dto.entity.ProductLadderDto ProductLadderDto;
}
