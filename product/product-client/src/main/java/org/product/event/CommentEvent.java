package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class CommentEvent {
    private org.product.dto.entity.CommentDto CommentDto;
}
