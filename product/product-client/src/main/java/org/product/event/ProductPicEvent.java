package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.product.dto.aggre.product.ProductPicDto;

@Value
@AllArgsConstructor
public class ProductPicEvent {
    private org.product.dto.aggre.product.ProductPicDto ProductPicDto;
}
