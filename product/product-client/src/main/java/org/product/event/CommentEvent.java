package org.product.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class CommentEvent {
    private CommentDto CommentDto;
}
