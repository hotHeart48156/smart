package org.activite.commandhandle;

import lombok.Value;

@Value
public class RecommendSubjectCommandHandle {
    @CommandHandler
    public void on(RecommendSubjectCommand Command) {
        AggregateLifecycle.apply(new RecommendSubjectEvent(Command.getRecommendSubjectDto()));
    }
}
