package org.account.domain.gateway.build;

import org.account.domain.account.entity.User;

/**
 * @author "yangbiao"
 */
public interface UserBuild {
    public User toUser(Object userDo);

    public Object toUserEntity(User user);

}
