package org.order.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class ReceiverNameEvent {
    private ReceiverNameDto ReceiverNameDto;
}