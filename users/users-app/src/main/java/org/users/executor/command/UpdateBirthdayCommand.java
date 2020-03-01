package org.users.executor.command;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.users.domain.customer.valueobject.id.UserId;
import org.users.domain.customer.valueobject.user.Birthday;
import org.users.dto.BirthdayDto;

/**
 * @author "yangbiao"
 */
@Value
@AllArgsConstructor
public class UpdateBirthdayCommand {
    BirthdayDto birthdayDto;
}
