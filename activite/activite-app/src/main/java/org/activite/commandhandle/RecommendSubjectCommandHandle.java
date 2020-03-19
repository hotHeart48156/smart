package org.activite.commandhandle;

import lombok.Value;

import org.axonframework.commandhandling.CommandHandler;
import org.activite.event.*;
import org.activite.executor.command.*;
import org.springframework.stereotype.Component;
@Value
@Component
public class RecommendSubjectCommandHandle   extends AbstractCommandHandle {
    @CommandHandler
    public void on(RecommendSubjectCommand Command) {
        AggregateLifecycle.apply(new RecommendSubjectEvent(Command.getRecommendSubjectDto()));
    }
}
