package org.activite.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class MarketingNameEvent   extends AbstractEvent {
    private org.activite.dto.agg.MarketingNameDto MarketingNameDto;
}
