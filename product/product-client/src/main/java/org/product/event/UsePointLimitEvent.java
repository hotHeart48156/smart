package org.product.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class UsePointLimitEvent {
    private UsePointLimitDto UsePointLimitDto;
}
