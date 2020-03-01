package org.users.executor.command;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.users.domain.customer.valueobject.id.UserId;
import org.users.domain.customer.valueobject.user.Password;
import org.users.dto.PasswordDto;

/**
 * @author "yangbiao"
 */
@Value
@AllArgsConstructor
public class UpdatePasswordCommand {
    PasswordDto passwordDto;
}
