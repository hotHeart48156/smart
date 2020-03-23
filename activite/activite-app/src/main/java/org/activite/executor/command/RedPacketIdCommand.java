package org.activite.executor.command;

import lombok.Value;
import org.activite.executor.AbstractCommand;

@Value
public class RedPacketIdCommand extends AbstractCommand{
    private org.activite.dto.agg.redpacket.RedPacketIdDto RedPacketIdDto;
}
