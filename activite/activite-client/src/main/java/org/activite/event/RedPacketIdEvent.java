package org.activite.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class RedPacketIdEvent   extends AbstractEvent  {
    private org.activite.dto.agg.redpacket.RedPacketIdDto RedPacketIdDto;
}
