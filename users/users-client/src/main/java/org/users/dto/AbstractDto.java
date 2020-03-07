package org.users.dto;

import org.users.domain.aggregation.User;

/**
 * @author "yangbiao"
 */
public abstract class AbstractDto {
    public abstract void accept(User user);
}
