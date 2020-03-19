package org.activite.executor.command;

import lombok.Value;
import org.activite.executor.AbstractCommand;

import org.activite.executor.AbstractCommand;
@Value
public class RedPacketStatusCommand extends AbstractCommand{
    private org.activite.dto.agg.RedPacketStatusDto RedPacketStatusDto;
}
