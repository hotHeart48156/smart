package org.activite.executor.command;

import lombok.Value;
import org.activite.executor.AbstractCommand;

@Value
public class MarketingIdCommand extends AbstractCommand {
    private MarketingIdDto MarketingIdDto;

}
