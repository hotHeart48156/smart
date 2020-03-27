package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class MemberPriceEvent {
    private org.product.dto.entity.MemberPriceDto MemberPriceDto;
}
