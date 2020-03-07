package org.order.domain.vaueobject.attr;

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
public class ProductAttributes extends Attrbutes {
    @Column(name = "product_attributes")
    String productAttributes;
}
