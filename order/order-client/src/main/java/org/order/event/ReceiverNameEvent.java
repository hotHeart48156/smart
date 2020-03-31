package org.order.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.order.dto.aggredto.ReceiverNameDto;

@Value
@AllArgsConstructor
public class ReceiverNameEvent {
    private org.order.dto.aggredto.ReceiverNameDto ReceiverNameDto;
}
