package org.order.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.order.dto.aggredto.DeliveryCompanyNameDto;

@Value
@AllArgsConstructor
public class DeliveryCompanyNameEvent {
    private org.order.dto.aggredto.DeliveryCompanyNameDto DeliveryCompanyNameDto;
}
