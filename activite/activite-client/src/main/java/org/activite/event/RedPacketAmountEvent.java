package org.activite.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class RedPacketAmountEvent {
    private RedPacketAmountDto RedPacketAmountDto;
}
