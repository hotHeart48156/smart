package org.activite.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class PromotionLogEvent {
    private PromotionLogDto PromotionLogDto;
}
