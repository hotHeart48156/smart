package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.product.dto.entity.CommentReplyDto;

@Value
@AllArgsConstructor
public class CommentReplyEvent {
    private org.product.dto.entity.CommentReplyDto CommentReplyDto;
}
