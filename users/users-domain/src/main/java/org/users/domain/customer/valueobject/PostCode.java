package org.users.domain.customer.valueobject;

import lombok.Value;

/**
 * @author "yangbiao"
 */
@Value
public class PostCode implements ValueObject {
    private String postCode;
}
