package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class ProductPicEvent {
    private org.product.dto.aggre.product.ProductPicDto ProductPicDto;
}
