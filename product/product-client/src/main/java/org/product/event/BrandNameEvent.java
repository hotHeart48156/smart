package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.product.dto.aggre.brand.BrandNameDto;

@Value
@AllArgsConstructor
public class BrandNameEvent {
    private org.product.dto.aggre.brand.BrandNameDto BrandNameDto;
}
