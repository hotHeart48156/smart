package org.activite.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.activite.domain.valueobject.time.EndTime;

@Value
@AllArgsConstructor
public class EndTimeEvent extends AbstractEvent  {
private EndTime endTime;
}
