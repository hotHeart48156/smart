package org.order.executor.command.aggre;

import lombok.Value;

@Value
public class AddressCommand {
    private org.order.dto.entitydto.AddressDto AddressDto;
}
