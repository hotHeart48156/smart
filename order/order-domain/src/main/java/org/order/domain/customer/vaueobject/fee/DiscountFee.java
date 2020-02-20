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
public class DiscountFee extends AbstractFee {
    @Column(name = "discount_fee")
    private BigDecimal discountFee;

}
