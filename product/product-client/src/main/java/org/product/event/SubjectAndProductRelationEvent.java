package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.product.dto.entity.SubjectAndProductRelationDto;

@Value
@AllArgsConstructor
public class SubjectAndProductRelationEvent {
    private org.product.dto.entity.SubjectAndProductRelationDto SubjectAndProductRelationDto;
}
