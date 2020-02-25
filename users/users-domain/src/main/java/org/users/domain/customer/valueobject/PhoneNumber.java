package org.users.domain.customer.valueobject;

import lombok.Value;

import javax.persistence.Entity;

/**
 * @author "yangbiao"
 */
@Value
public class PhoneNumber implements ValueObject {
    Long phoneNumber;
}
