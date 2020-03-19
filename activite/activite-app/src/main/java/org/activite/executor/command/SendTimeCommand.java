package org.activite.executor.command;

import lombok.Value;
import org.activite.executor.AbstractCommand;

import org.activite.executor.AbstractCommand;
@Value
public class SendTimeCommand extends AbstractCommand{
    private org.activite.dto.agg.SendTimeDto SendTimeDto;
}
