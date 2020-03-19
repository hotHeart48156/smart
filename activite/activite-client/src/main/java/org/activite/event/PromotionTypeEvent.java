package org.activite.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class PromotionTypeEvent   extends AbstractEvent {
    private org.activite.dto.entity.PromotionTypeDto PromotionTypeDto;
}
