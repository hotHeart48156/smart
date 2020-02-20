package org.order.domain.customer.vaueobject.address;

import lombok.EqualsAndHashCode;
import lombok.Value;

import javax.persistence.Column;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@Value
public class DetailAddress extends AbstractAddress {
    @Column(name = "detail_address")
    private String detailAddress;

}
