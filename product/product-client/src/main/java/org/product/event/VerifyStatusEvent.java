package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.product.dto.aggre.product.VerifyStatusDto;

@Value
@AllArgsConstructor
public class VerifyStatusEvent {
    private org.product.dto.aggre.product.VerifyStatusDto VerifyStatusDto;
}
