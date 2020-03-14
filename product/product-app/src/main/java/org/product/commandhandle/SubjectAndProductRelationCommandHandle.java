package org.product.commandhandle;

import lombok.Value;

@Value
public class SubjectAndProductRelationCommandHandle {
    @CommandHandler
    public void on(SubjectAndProductRelationCommand Command) {
        AggregateLifecycle.apply(new SubjectAndProductRelationEvent(Command.getSubjectAndProductRelationDto()));
    }
}
