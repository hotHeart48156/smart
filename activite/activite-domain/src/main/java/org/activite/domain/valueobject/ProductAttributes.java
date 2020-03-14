package org.activite.domain.valueobject;

import lombok.Value;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author "yangbiao"
 */
@Embeddable
@Value
public class ProductAttributes implements ValueObject {
    @Column(name = "productAttributes")
    private String productAttributes;
}
