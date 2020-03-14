package org.activite.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class RedPacketCountEvent {
    private RedPacketCountDto RedPacketCountDto;
}
