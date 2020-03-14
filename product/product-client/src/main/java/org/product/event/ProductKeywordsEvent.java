package org.product.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class ProductKeywordsEvent {
    private ProductKeywordsDto ProductKeywordsDto;
}
