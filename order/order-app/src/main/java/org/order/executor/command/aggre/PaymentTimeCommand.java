package org.order.executor.command.aggre;

import lombok.Value;

@Value
public class PaymentTimeCommand {
    private org.order.dto.aggredto.PaymentTimeDto PaymentTimeDto;
}
