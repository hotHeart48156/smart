package org.users.domain.customer.valueobject;

import lombok.Value;

/**
 * @author "yangbiao"
 */
@Value
public class MaxPointPerOrder implements ValueObject {
    String point;
}
