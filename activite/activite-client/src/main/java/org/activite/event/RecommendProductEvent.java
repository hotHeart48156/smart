package org.activite.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class RecommendProductEvent   extends AbstractEvent   {
    private org.activite.dto.entity.RecommendProductDto RecommendProductDto;
}
