package org.order.domain.customer.vaueobject.name;

import lombok.EqualsAndHashCode;
import lombok.Value;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@Value
@Embeddable
public class ProductName extends AbstractName {
    @Column(name = "product_name")
    private String productName;
}
