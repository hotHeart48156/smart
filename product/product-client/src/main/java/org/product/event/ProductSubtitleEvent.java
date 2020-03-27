package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class ProductSubtitleEvent {
    private org.product.dto.aggre.product.ProductSubtitleDto ProductSubtitleDto;
}
