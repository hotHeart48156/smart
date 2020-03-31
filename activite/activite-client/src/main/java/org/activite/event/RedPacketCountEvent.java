package org.activite.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class RedPacketCountEvent   extends AbstractEvent  {
    private org.activite.dto.agg.redpacket.RedPacketCountDto RedPacketCountDto;
}
