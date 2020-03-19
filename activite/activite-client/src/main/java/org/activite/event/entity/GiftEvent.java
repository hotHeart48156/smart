package org.activite.event.entity;

import org.activite.dto.entity.GiftDto;
import org.activite.event.AbstractEvent;

import lombok.Value;
@Value
public class GiftEvent  extends AbstractEvent
{
    GiftDto giftDto;
}