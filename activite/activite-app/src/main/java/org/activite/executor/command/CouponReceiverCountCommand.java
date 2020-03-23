package org.activite.executor.command;

import lombok.Value;

import org.activite.executor.AbstractCommand;
@Value
public class CouponReceiverCountCommand extends AbstractCommand{
    private org.activite.dto.agg.coupon.CouponReceiverCountDto CouponReceiverCountDto;
}
