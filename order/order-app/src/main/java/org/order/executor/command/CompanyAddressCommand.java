package org.order.executor.command;

import lombok.Value;
import org.order.dto.entitydto.CompanyAddressDto;
@Value
public class CompanyAddressCommand  extends AbstractCommand{
private CompanyAddressDto  CompanyAddressDto;
}
