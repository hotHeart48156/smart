package org.activite.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class RedPacketAmountEvent {
    private org.activite.dto.agg.RedPacketAmountDto RedPacketAmountDto;
}
  extends AbstractEvent 