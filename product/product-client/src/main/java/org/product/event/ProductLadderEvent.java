package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.product.dto.entity.ProductLadderDto;

@Value
@AllArgsConstructor
public class ProductLadderEvent {
    private org.product.dto.entity.ProductLadderDto ProductLadderDto;
}
