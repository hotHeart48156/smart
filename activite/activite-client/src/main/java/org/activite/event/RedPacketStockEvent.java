package org.activite.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class RedPacketStockEvent   extends AbstractEvent {
    private org.activite.dto.agg.redpacket.RedPacketStockDto RedPacketStockDto;
}
