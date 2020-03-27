package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class ProductKeywordsEvent {
    private org.product.dto.aggre.product.ProductKeywordsDto ProductKeywordsDto;
}
