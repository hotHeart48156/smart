package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class VerifyStatusEvent {
    private org.product.dto.aggre.product.VerifyStatusDto VerifyStatusDto;
}
