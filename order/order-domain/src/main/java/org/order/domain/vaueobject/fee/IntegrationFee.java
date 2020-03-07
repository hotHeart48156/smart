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
public class IntegrationFee extends AbstractFee {
    @Column(name = "integration_fee")
    private BigDecimal integrationFee;

}
