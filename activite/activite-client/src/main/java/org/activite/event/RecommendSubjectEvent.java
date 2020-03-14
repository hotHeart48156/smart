package org.activite.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class RecommendSubjectEvent {
    private RecommendSubjectDto RecommendSubjectDto;
}
