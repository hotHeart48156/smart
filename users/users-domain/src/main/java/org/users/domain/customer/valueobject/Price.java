package org.users.domain.customer.valueobject;

import lombok.Value;

import java.math.BigDecimal;

/**
 * @author "yangbiao"
 */
@Value
public class Price implements ValueObject {
    BigDecimal price;
}
