package org.activite.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class RedPacketIdEvent {
    private RedPacketIdDto RedPacketIdDto;
}
