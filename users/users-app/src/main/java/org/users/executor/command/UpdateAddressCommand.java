package org.users.executor.command;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.users.domain.customer.entity.Address;
import org.users.dto.AddressDto;

/**
 * @author "yangbiao"
 */
@Value
@AllArgsConstructor
public class UpdateAddressCommand {
    private AddressDto address;
}
