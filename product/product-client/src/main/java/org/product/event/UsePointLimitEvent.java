package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class UsePointLimitEvent {
    private org.product.dto.aggre.product.UsePointLimitDto UsePointLimitDto;
}
