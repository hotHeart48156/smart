package org.activite.executor.command;

import lombok.Value;
import org.activite.executor.AbstractCommand;

@Value
public class RedPacketReceiveAmountCommand extends AbstractCommand{
    private org.activite.dto.agg.redpacket.RedPacketReceiveAmountDto RedPacketReceiveAmountDto;
}
