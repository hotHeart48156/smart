package org.product.domain.valueobject.address;

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
public class City extends AbstractAddress {
    @Column(name = "city")
    private String city;
}
