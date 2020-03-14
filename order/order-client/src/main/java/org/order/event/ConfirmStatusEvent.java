package org.order.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class ConfirmStatusEvent {
    private ConfirmStatusDto ConfirmStatusDto;
}
