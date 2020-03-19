package org.activite.event.entity;

import org.activite.dto.entity.HomeAdvertiseDto;
import org.activite.event.AbstractEvent;

import lombok.Value;
@Value
public class HomeAdvertiseEvent  extends AbstractEvent
{
    HomeAdvertiseDto homeAdvertiseDto;
}