package org.activite.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class RedPacketStockEvent {
    private RedPacketStockDto RedPacketStockDto;
}
