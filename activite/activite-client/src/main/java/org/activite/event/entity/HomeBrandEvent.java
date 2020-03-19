package org.activite.event.entity;

import org.activite.dto.entity.HomeBrandDto;
import org.activite.event.AbstractEvent;

import lombok.Value;
@Value
public class HomeBrandEvent  extends AbstractEvent
{
    HomeBrandDto homeBrandDto;
}