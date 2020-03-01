package org.users.executor.command;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.users.domain.customer.valueobject.PhoneNumber;
import org.users.domain.customer.valueobject.id.UserId;
import org.users.dto.PhoneDto;

/**
 * @author "yangbiao"
 */
@Value
@AllArgsConstructor
public class UpdatePhoneCommand {
    PhoneDto phoneDto;
}
