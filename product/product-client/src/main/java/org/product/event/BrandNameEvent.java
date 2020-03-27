package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class BrandNameEvent {
    private org.product.dto.aggre.brand.BrandNameDto BrandNameDto;
}
