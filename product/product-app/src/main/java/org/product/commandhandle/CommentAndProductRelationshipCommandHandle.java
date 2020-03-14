package org.product.commandhandle;

import lombok.Value;

@Value
public class CommentAndProductRelationshipCommandHandle {
    @CommandHandler
    public void on(CommentAndProductRelationshipCommand Command) {
        AggregateLifecycle.apply(new CommentAndProductRelationshipEvent(Command.getCommentAndProductRelationshipDto()));
    }
}
