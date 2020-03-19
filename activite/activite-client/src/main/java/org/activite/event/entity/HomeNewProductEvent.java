package org.activite.event.entity;

import org.activite.dto.entity.HomeNewProductDto;
import org.activite.event.AbstractEvent;

import lombok.Value;
@Value
public class HomeNewProductEvent  extends AbstractEvent
{
    HomeNewProductDto homeNewProductDto;
}