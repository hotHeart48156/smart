package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.product.dto.aggre.product.ProductCountDto;

@Value
@AllArgsConstructor
public class ProductCountEvent {
    private org.product.dto.aggre.product.ProductCountDto ProductCountDto;
}
