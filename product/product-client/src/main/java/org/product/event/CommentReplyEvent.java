package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class CommentReplyEvent {
    private org.product.dto.entity.CommentReplyDto CommentReplyDto;
}
