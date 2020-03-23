package org.activite.executor.command;

import lombok.Value;
import org.activite.executor.AbstractCommand;

@Value
public class ActivityGoodsCommand extends AbstractCommand {
    private org.activite.dto.agg.marketing.ActivityGoodsDto ActivityGoodsDto;
}
