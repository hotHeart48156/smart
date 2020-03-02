package org.users.domain.customer.valueobject.address;

import lombok.EqualsAndHashCode;
import lombok.Value;

import javax.persistence.Embeddable;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@Value
@Embeddable

public class DetailAddress extends AbstractAddress {
    private String detailAddress;
}
