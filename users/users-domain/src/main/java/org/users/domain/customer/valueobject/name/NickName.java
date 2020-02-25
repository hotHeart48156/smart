package org.users.domain.customer.valueobject.name;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Value;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@Value
public class NickName extends AbstractName {
    private String name;

}
