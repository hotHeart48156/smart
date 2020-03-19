package org.activite.event.entity;

import org.activite.dto.entity.GroupDto;
import org.activite.event.AbstractEvent;

import lombok.Value;
@Value
public class GroupEvent  extends AbstractEvent
{
    GroupDto groupDto;
}