package org.activite.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class RedPacketAmountEvent   extends AbstractEvent  {
    private org.activite.dto.agg.redpacket.RedPacketAmountDto RedPacketAmountDto;
}
