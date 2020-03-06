package org.users.domain.customer.valueobject.address;

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

public class DetailAddress extends AbstractAddress {
@Column(name ="   detailAddress")
private String detailAddress;
}
