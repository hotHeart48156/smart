package org.activite.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class RedPacketCountEvent {
    private org.activite.dto.agg.RedPacketCountDto RedPacketCountDto;
}
  extends AbstractEvent 