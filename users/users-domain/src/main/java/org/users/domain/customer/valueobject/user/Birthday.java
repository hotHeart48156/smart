package org.users.domain.customer.valueobject.user;

import lombok.Value;
import org.users.domain.customer.valueobject.ValueObject;

import java.sql.Timestamp;

/**
 * @author "yangbiao"
 */
@Value
public class Birthday implements ValueObject {
    private Timestamp birthday;
}
