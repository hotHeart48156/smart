package org.order.domain.vaueobject.price;

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
public class ProductPrice extends AbstractPrice {
    @Column(name = "product_price")
    private BigDecimal productPrice;

}
