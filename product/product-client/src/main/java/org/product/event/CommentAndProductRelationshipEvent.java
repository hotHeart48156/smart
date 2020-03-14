package org.product.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class CommentAndProductRelationshipEvent {
    private CommentAndProductRelationshipDto CommentAndProductRelationshipDto;
}
