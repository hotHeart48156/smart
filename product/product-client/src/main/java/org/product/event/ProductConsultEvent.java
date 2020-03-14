package org.product.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class ProductConsultEvent {
    private ProductConsultDto ProductConsultDto;
}
