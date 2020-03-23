package org.activite.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class SendTimeEvent   extends AbstractEvent {
    private org.activite.dto.agg.redpacket.SendTimeDto SendTimeDto;
}
