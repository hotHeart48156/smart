package org.activite.executor.command;

import lombok.Value;
import org.activite.executor.AbstractCommand;

@Value
public class RedPacketCountCommand extends AbstractCommand{
    private org.activite.dto.agg.redpacket.RedPacketCountDto RedPacketCountDto;
}
