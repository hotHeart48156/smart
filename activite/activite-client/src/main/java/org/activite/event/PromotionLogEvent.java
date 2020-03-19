package org.activite.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class PromotionLogEvent   extends AbstractEvent{
    private org.activite.dto.entity.PromotionLogDto PromotionLogDto;
}
