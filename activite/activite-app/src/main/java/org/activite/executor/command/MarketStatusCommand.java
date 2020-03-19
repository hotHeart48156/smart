package org.activite.executor.command;

import lombok.Value;
import org.activite.executor.AbstractCommand;

import org.activite.executor.AbstractCommand;
@Value
public class MarketStatusCommand extends AbstractCommand {
    private org.activite.dto.agg.MarketStatusDto MarketStatusDto;
}
