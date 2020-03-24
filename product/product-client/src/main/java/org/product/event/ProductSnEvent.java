package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.product.dto.aggre.product.ProductSnDto;

@Value
@AllArgsConstructor
public class ProductSnEvent {
    private org.product.dto.aggre.product.ProductSnDto ProductSnDto;
}
