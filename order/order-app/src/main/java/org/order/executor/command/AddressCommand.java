package org.order.executor.command;

import lombok.Value;
@Value
public class AddressCommand  extends AbstractCommand{
private org.order.dto.entitydto.AddressDto AddressDto;
}
