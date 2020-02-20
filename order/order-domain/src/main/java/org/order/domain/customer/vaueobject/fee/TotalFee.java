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
public class TotalFee extends AbstractFee {
    @Column(name = "total_fee")
    private BigDecimal totalFee;

}
