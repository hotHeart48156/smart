package org.product.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class MemberPriceEvent {
    private MemberPriceDto MemberPriceDto;
}
