package org.users.domainevent.aggevent;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class JobEvent {
    private org.users.dto.agg.JobDto JobDto;
}
