package org.activite.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class RedPacketStatusEvent   extends AbstractEvent {
    private org.activite.dto.agg.redpacket.RedPacketStatusDto RedPacketStatusDto;
}
