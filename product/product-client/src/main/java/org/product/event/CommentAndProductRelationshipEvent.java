package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class CommentAndProductRelationshipEvent {
    private org.product.dto.entity.CommentAndProductRelationshipDto CommentAndProductRelationshipDto;
}
