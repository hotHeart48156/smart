package org.activite.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class PlatformEvent   extends AbstractEvent {
    private org.activite.dto.agg.PlatformDto PlatformDto;
}
