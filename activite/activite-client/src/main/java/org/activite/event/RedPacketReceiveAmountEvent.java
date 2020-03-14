package org.activite.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class RedPacketReceiveAmountEvent {
    private RedPacketReceiveAmountDto RedPacketReceiveAmountDto;
}
