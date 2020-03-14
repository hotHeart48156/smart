package org.order.executor.command.aggre;

import lombok.Value;

@Value
public class ConfirmStatusCommand {
    private org.order.dto.aggredto.ConfirmStatusDto ConfirmStatusDto;
}
