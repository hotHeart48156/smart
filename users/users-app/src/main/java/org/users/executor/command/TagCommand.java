package org.users.executor.command;

import lombok.Value;
import org.users.dto.entitydto.TagDto;
@Value
public class TagCommand  extends AbstractCommand
{
    private TagDto tagDto;
}