package org.product.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class ProductSubtitleEvent {
    private ProductSubtitleDto ProductSubtitleDto;
}
