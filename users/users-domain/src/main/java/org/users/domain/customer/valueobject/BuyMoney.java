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
public class BuyMoney implements ValueObject {
    @Column(name ="   buyMoney")
private BigDecimal money;
}
