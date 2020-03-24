package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.product.dto.aggre.product.ProductSubtitleDto;

@Value
@AllArgsConstructor
public class ProductSubtitleEvent {
    private org.product.dto.aggre.product.ProductSubtitleDto ProductSubtitleDto;
}
