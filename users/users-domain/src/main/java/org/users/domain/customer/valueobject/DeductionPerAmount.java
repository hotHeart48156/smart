package org.users.domain.customer.valueobject;

import lombok.Value;

import java.math.BigDecimal;

/**
 * @author "yangbiao"
 */
@Value
public class DeductionPerAmount implements ValueObject {
    private BigDecimal amount;
}
