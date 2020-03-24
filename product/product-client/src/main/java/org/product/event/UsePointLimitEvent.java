package org.product.event;

import lombok.Value;
import lombok.AllArgsConstructor;
import org.product.dto.aggre.product.UsePointLimitDto;

@Value
@AllArgsConstructor
public class UsePointLimitEvent {
    private org.product.dto.aggre.product.UsePointLimitDto UsePointLimitDto;
}
