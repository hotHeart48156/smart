package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.product.dto.entity.ProductConsultDto;

@Value
@AllArgsConstructor
public class ProductConsultEvent {
    private org.product.dto.entity.ProductConsultDto ProductConsultDto;
}
