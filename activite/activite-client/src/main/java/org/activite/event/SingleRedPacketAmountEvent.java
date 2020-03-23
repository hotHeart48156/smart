package org.activite.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class SingleRedPacketAmountEvent   extends AbstractEvent  {
    private org.activite.dto.agg.redpacket.SingleRedPacketAmountDto SingleRedPacketAmountDto;
}
