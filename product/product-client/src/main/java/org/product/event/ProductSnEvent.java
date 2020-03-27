package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class ProductSnEvent {
    private org.product.dto.aggre.product.ProductSnDto ProductSnDto;
}
