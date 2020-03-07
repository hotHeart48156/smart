package org.users.dto.domainevent;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Value;
import org.users.dto.PasswordDto;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@Value
@AllArgsConstructor
public class UpdatePasswordEvent extends AbstractEvent {
    PasswordDto passwordDto;
}
