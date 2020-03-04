package org.order.domain.customer.vaueobject.fee;

import lombok.EqualsAndHashCode;
import lombok.Value;
import org.order.domain.customer.vaueobject.id.AbstractId;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.math.BigDecimal;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@Value
@Embeddable
public class RepayFee extends AbstractFee {
    @Column(name = "repay_fee")
    private BigDecimal repayFee;

}
