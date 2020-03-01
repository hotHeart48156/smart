package org.users.dto;

import org.users.domain.customer.aggregation.User;

/**
 * @author "yangbiao"
 */
public abstract class AbstractDto {
    public abstract void accept(User user);
}
