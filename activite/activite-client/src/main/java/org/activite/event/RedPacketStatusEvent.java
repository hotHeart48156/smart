package org.activite.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class RedPacketStatusEvent {
    private RedPacketStatusDto RedPacketStatusDto;
}
