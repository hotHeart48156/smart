package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.product.dto.aggre.product.ProductKeywordsDto;

@Value
@AllArgsConstructor
public class ProductKeywordsEvent {
    private org.product.dto.aggre.product.ProductKeywordsDto ProductKeywordsDto;
}
