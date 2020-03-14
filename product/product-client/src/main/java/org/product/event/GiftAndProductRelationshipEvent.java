package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class GiftAndProductRelationshipEvent {
    private GiftAndProductRelationshipDto GiftAndProductRelationshipDto;
}
