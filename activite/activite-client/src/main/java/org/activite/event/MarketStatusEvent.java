package org.activite.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class MarketStatusEvent {
    private MarketStatusDto MarketStatusDto;
}
