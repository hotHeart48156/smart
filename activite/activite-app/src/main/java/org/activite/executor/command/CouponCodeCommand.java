package org.activite.executor.command;

import lombok.Value;
import org.activite.executor.AbstractCommand;

@Value
public class CouponCodeCommand extends AbstractCommand extends AbstractCommand{
    private org.activite.dto.agg.coupon.CouponCodeDto CouponCodeDto;
}
