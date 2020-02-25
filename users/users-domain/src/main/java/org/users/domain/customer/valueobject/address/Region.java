package org.users.domain.customer.valueobject.address;

import lombok.EqualsAndHashCode;
import lombok.Value;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@Value
public class Region extends AbstractAddress {
    private String region;
}
