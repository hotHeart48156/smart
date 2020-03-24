package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.product.dto.entity.GiftAndProductRelationshipDto;

@Value
@AllArgsConstructor
public class GiftAndProductRelationshipEvent {
    private org.product.dto.entity.GiftAndProductRelationshipDto GiftAndProductRelationshipDto;
}
