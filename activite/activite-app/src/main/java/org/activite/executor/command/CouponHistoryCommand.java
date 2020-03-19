package org.activite.executor.command;

import lombok.Value;

import org.activite.executor.AbstractCommand;
@Value
public class CouponHistoryCommand extends AbstractCommand{
    private org.activite.dto.entity.CouponHistoryDto CouponHistoryDto;
}
