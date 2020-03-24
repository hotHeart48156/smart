package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.product.dto.entity.MemberPriceDto;

@Value
@AllArgsConstructor
public class MemberPriceEvent {
    private org.product.dto.entity.MemberPriceDto MemberPriceDto;
}
