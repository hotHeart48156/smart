package org.activite.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class RecommendSubjectEvent {
    private org.activite.dto.entity.RecommendSubjectDto RecommendSubjectDto;
}
  extends AbstractEvent   extends AbstractEvent 