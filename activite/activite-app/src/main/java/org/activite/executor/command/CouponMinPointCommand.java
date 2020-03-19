package org.activite.executor.command;

import lombok.Value;

import org.activite.executor.AbstractCommand;
@Value
public class CouponMinPointCommand extends AbstractCommand{
    private org.activite.dto.agg.CouponMinPointDto CouponMinPointDto;
}
