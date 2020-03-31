package org.activite.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class RecommendSubjectEvent extends AbstractEvent {
    private org.activite.dto.entity.RecommendSubjectDto RecommendSubjectDto;
}
