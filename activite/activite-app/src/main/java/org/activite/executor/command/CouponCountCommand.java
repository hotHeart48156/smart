package org.activite.executor.command;

import lombok.Value;

import org.activite.executor.AbstractCommand;
@Value
public class CouponCountCommand extends AbstractCommand{
    private org.activite.dto.agg.coupon.CouponCountDto CouponCountDto;
}
