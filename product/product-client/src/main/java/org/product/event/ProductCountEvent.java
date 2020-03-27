package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class ProductCountEvent {
    private org.product.dto.aggre.product.ProductCountDto ProductCountDto;
}
