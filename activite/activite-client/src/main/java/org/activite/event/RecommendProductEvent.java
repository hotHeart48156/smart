package org.activite.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class RecommendProductEvent {
    private org.activite.dto.entity.RecommendProductDto RecommendProductDto;
}
  extends AbstractEvent   extends AbstractEvent 