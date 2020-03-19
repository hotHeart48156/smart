package org.activite.event.entity;

import org.activite.dto.entity.RecommendProductDto;
import org.activite.event.AbstractEvent;

import lombok.Value;
@Value
public class RecommendProductEvent  extends AbstractEvent
{
    RecommendProductDto recommendProductDto;
}