package org.activite.executor.command;

import lombok.Value;

import org.activite.executor.AbstractCommand;
@Value
public class EndTimeCommand extends AbstractCommand{
    private org.activite.dto.agg.marketing.EndTimeDto EndTimeDto;
}
