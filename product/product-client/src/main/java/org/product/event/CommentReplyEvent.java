package org.product.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class CommentReplyEvent {
    private CommentReplyDto CommentReplyDto;
}
