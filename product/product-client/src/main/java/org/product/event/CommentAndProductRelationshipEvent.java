package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.product.dto.entity.CommentAndProductRelationshipDto;

@Value
@AllArgsConstructor
public class CommentAndProductRelationshipEvent {
    private org.product.dto.entity.CommentAndProductRelationshipDto CommentAndProductRelationshipDto;
}
