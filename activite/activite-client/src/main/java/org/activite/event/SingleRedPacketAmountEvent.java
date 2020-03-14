package org.activite.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class SingleRedPacketAmountEvent {
    private SingleRedPacketAmountDto SingleRedPacketAmountDto;
}
