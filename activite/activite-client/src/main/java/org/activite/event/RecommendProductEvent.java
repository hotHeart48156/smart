package org.activite.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class RecommendProductEvent {
    private RecommendProductDto RecommendProductDto;
}