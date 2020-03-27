package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class ProductConsultEvent {
    private org.product.dto.entity.ProductConsultDto ProductConsultDto;
}
