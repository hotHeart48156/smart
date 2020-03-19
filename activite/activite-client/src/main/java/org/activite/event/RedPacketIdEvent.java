package org.activite.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class RedPacketIdEvent {
    private org.activite.dto.agg.RedPacketIdDto RedPacketIdDto;
}
  extends AbstractEvent 