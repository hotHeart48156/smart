package org.order.domain.customer.vaueobject.fee;

import lombok.EqualsAndHashCode;
import lombok.Value;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.math.BigDecimal;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@Value
@Embeddable
public class PayFee extends AbstractFee {
    @Column(name = "pay_fee")
    private BigDecimal payFee;

}
