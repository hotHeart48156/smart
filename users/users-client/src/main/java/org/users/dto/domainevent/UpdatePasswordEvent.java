package org.users.dto.domainevent;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Value;
import org.users.domain.customer.valueobject.id.UserId;
import org.users.domain.customer.valueobject.user.Password;
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
