package org.product.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class SubjectAndProductRelationEvent {
    private SubjectAndProductRelationDto SubjectAndProductRelationDto;
}