package org.account.domain.gateway.build;

import org.account.domain.account.entity.Permission;

/**
 * @author "yangbiao"
 */
public interface PermissionBuild {
    public Permission toPermission(Object PermissionDo);
}
