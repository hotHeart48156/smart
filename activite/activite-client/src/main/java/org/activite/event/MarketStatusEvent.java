package org.activite.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class MarketStatusEvent   extends AbstractEvent {
    private org.activite.dto.agg.marketing.MarketStatusDto MarketStatusDto;
}
