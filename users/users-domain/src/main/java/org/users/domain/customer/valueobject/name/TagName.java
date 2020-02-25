package org.users.domain.customer.valueobject.name;

import lombok.EqualsAndHashCode;
import lombok.Value;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@Value
public class TagName extends AbstractName {
    String name;
}
