package org.users.executor.command;

import lombok.EqualsAndHashCode;
import lombok.Value;
import org.users.domain.entity.AppletSet;
import org.users.dto.entitydto.AppletSetDto;
@EqualsAndHashCode(callSuper = true)
@Value
public class AppletSetCommand  extends AbstractCommand
{
    AppletSetDto appletSetDto;
}