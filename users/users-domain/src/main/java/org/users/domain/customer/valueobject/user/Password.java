package org.users.domain.customer.valueobject.user;

import lombok.Value;
import org.users.domain.customer.valueobject.ValueObject;

/**
 * @author "yangbiao"
 */
@Value
public class Password implements ValueObject {
    private String password;
}
