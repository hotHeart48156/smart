package org.activite.event.entity;

import org.activite.dto.entity.GroupMemberDto;
import org.activite.event.AbstractEvent;

import lombok.Value;
@Value
public class GroupMemberEvent  extends AbstractEvent
{
    GroupMemberDto groupMemberDto;
}