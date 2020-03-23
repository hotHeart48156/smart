package org.activite.executor.command;

import lombok.Value;
import org.activite.executor.AbstractCommand;

@Value
public class PlatformCommand extends AbstractCommand{
    private org.activite.dto.agg.redpacket.PlatformDto PlatformDto;
}
