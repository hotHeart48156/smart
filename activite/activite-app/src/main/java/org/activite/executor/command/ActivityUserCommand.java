package org.activite.executor.command;

import lombok.Value;

import org.activite.executor.AbstractCommand;
@Value
public class ActivityUserCommand extends AbstractCommand{
    private org.activite.dto.agg.marketing.ActivityUserDto ActivityUserDto;
}
