package org.order.domain.vaueobject.fee;

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
public class PromotionFee extends AbstractFee {
    @Column(name = "promote_fee")
    private BigDecimal promoteFee;

}
