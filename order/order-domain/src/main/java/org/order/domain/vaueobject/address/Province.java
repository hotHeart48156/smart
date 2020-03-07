package org.order.domain.vaueobject.address;

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
public class Province extends AbstractAddress {
    @Column(name = "provice")
    private String province;

}
