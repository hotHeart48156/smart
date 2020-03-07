package org.users.executor.command;

import lombok.Value;
import org.users.dto.entitydto.RoleDto;
@Value
public class RoleCommand  extends AbstractCommand
{
    private RoleDto roleDto;
}