package org.activite.executor.command;

import lombok.Value;

import org.activite.executor.AbstractCommand;
@Value
public class CouponUsedCountCommand extends AbstractCommand{
    private org.activite.dto.agg.coupon.CouponUsedCountDto CouponUsedCountDto;
}
