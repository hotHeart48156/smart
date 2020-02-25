package org.users.domain.customer.valueobject;

import lombok.Value;

/**
 * @author "yangbiao"
 */
@Value
public class ConsumePerPoint implements ValueObject {
    private Long point;
}
