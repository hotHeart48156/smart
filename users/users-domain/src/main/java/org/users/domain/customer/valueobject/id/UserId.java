package org.users.domain.customer.valueobject.id;

import lombok.EqualsAndHashCode;
import lombok.Value;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@Value
public class UserId extends AbstractId {
    private Long id;

}
