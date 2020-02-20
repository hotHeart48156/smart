package org.account.domain.gateway.build;

import org.account.domain.account.entity.RoleAndPermission;

/**
 * @author "yangbiao"
 */
public interface RoleAndPermissionBuild {
    public RoleAndPermission toRoleAndPermission(Object RoleAndPermissionDo);

}
