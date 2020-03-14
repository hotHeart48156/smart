package org.product.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class VerifyStatusEvent {
    private VerifyStatusDto VerifyStatusDto;
}
