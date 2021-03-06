package org.order.domain.vaueobject.product;

import lombok.EqualsAndHashCode;
import lombok.Value;
import org.order.domain.vaueobject.ValueObject;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author "yangbiao"
 */
@Value
@EqualsAndHashCode
@Embeddable
public class ProductBrand implements ValueObject {
    @Column(name = "product_brand_id")
    private String productBrand;

}
