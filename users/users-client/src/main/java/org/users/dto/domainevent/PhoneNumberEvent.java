package org.users.dto.domainevent;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Value;
import org.users.domain.customer.valueobject.PhoneNumber;
import org.users.domain.customer.valueobject.id.UserId;
import org.users.dto.PhoneDto;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@Value
@AllArgsConstructor
public class PhoneNumberEvent extends AbstractEvent {
    PhoneDto phoneDto;

}
