package org.order.executor.command.aggre;

import lombok.Value;

@Value
public class AddBillMessageCommand {
    private org.order.dto.aggredto.AddBillMessageDto AddBillMessageDto;
}
