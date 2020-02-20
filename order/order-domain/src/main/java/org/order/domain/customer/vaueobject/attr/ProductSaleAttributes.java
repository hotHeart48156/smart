package org.order.domain.customer.vaueobject.attr;

import lombok.EqualsAndHashCode;
import lombok.Value;

import javax.persistence.Embeddable;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = false)
@Value
@Embeddable
public class ProductSaleAttributes extends Attrbutes {
    String key;
    String value;
    String color;
    String contain;
}
