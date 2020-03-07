package org.users.executor.command;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.users.dto.PhoneDto;

/**
 * @author "yangbiao"
 */
@Value
@AllArgsConstructor
public class UpdatePhoneCommand {
    PhoneDto phoneDto;
}
