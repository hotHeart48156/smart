package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.product.dto.entity.FreightTemplateDto;

@Value
@AllArgsConstructor
public class FreightTemplateEvent {
    private org.product.dto.entity.FreightTemplateDto FreightTemplateDto;
}
