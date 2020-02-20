package org.order.domain.customer.vaueobject.phone;

import lombok.EqualsAndHashCode;
import lombok.Value;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author "yangbiao"
 */
@Value
@EqualsAndHashCode(callSuper = false)
@Embeddable
public class PhoneNumber extends AbstractPhone {
    @Column(name = "phone_number")
    private String phone;

}
