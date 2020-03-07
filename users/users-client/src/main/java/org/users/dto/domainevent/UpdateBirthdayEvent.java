package org.users.dto.domainevent;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Value;
import org.users.dto.BirthdayDto;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@Value
@AllArgsConstructor
public class UpdateBirthdayEvent extends AbstractEvent {
    BirthdayDto birthdayDto;

}
