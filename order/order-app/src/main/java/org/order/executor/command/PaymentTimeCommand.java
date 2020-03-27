package org.order.executor.command;

import lombok.Value;
import org.order.dto.aggredto.PaymentTimeDto;

@Value
public class PaymentTimeCommand  extends AbstractCommand{
private PaymentTimeDto  PaymentTimeDto;
}
