package org.order.executor.command.aggre;

import lombok.Value;

@Value
public class CompanyAddressCommand {
    private org.order.dto.entitydto.CompanyAddressDto CompanyAddressDto;
}
