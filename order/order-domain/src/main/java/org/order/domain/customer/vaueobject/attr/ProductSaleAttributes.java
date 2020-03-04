package org.order.domain.customer.vaueobject.attr;

import lombok.EqualsAndHashCode;
import lombok.Value;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = false)
@Value
@Embeddable
public class ProductSaleAttributes extends Attrbutes {
    @Column(name = "product_attributes")
    String key;

    @Column(name = "product_attributes")
    String value;

    @Column(name = "product_attributes")
    String color;

    @Column(name = "product_attributes")
    String contain;
}
