package org.users.domain.customer.valueobject.address;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Province extends AbstractAddress {
    private String province;

}
