package org.order.domain.customer.vaueobject.address;

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
    @Column(name = "city", length = 30, nullable = false, updatable = false)
    private String city;

}
