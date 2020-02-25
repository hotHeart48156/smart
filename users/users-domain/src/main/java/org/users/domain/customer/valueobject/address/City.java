package org.users.domain.customer.valueobject.address;

import lombok.EqualsAndHashCode;
import lombok.Value;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@Value
public class City extends AbstractAddress {
    private String city;
}
