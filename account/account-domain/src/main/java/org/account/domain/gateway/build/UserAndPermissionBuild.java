package org.account.domain.gateway.build;

import org.account.domain.account.entity.UserAndPermission;

/**
 * @author "yangbiao"
 */
public interface UserAndPermissionBuild {
    public UserAndPermission toUserAndPermission(Object UserAndPermissionDo);

}
