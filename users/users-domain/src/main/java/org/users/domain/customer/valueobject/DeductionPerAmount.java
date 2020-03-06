package org.users.domain.customer.valueobject;

import lombok.Value;

import java.math.BigDecimal;

import javax.persistence.Embeddable;
import javax.persistence.Column;
/**
 * @author "yangbiao"
 */
@Value
@Embeddable
public class DeductionPerAmount implements ValueObject {
    @Column(name ="   deductionPerAmount")
private BigDecimal amount;
}
