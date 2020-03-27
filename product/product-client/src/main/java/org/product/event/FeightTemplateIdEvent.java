package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class FeightTemplateIdEvent {
    private org.product.dto.aggre.product.FeightTemplateIdDto FeightTemplateIdDto;
}
