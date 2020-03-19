package org.activite.executor.command;

import lombok.Value;

import org.activite.executor.AbstractCommand;
@Value
public class GiftCommand extends AbstractCommand{
    private org.activite.dto.entity.GiftDto GiftDto;
}
