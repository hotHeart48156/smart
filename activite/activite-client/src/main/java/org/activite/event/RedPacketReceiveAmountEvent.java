package org.activite.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class RedPacketReceiveAmountEvent   extends AbstractEvent {
    private org.activite.dto.agg.redpacket.RedPacketReceiveAmountDto RedPacketReceiveAmountDto;
}
