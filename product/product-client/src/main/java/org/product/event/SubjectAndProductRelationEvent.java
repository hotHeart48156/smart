package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class SubjectAndProductRelationEvent {
    private org.product.dto.entity.SubjectAndProductRelationDto SubjectAndProductRelationDto;
}
