package org.order.domain.vaueobject.quantity;

import lombok.EqualsAndHashCode;
import lombok.Value;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.math.BigInteger;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@Value
@Embeddable
public class ReturnQuantity extends AbstractQuantity {
    @Column(name = "return_quantity")
    private BigInteger quantity;
}
