package org.order.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class CompanyAddressEvent {
    private org.order.dto.entitydto.CompanyAddressDto CompanyAddressDto;
}
