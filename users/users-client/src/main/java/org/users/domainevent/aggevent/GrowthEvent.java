package org.users.domainevent.aggevent;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class GrowthEvent {
    private org.users.dto.agg.GrowthDto GrowthDto;
}
