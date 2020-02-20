package org.account.domain.gateway.build;

import org.account.domain.account.entity.UserAndRole;

/**
 * @author "yangbiao"
 */
public interface UserAndRoleBuild {
    public UserAndRole toUserAndRole(Object UserAndRoleDo);

}
