package org.activite.event.entity;

import org.activite.dto.entity.PromotionLogDto;
import org.activite.event.AbstractEvent;

import lombok.Value;
@Value
public class PromotionLogEvent  extends AbstractEvent
{
    PromotionLogDto promotionLogDto;
}