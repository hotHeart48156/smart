package org.order.domain.customer.vaueobject;

import lombok.EqualsAndHashCode;
import lombok.Value;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author "yangbiao"
 */
@Value
@EqualsAndHashCode
@Embeddable
public class ProductPic implements ValueObject {
    @Column(name = "product_pic_url")
    private String productPicUrl;
}
