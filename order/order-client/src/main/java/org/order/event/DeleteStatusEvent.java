package org.order.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class DeleteStatusEvent {
    private DeleteStatusDto DeleteStatusDto;
}
