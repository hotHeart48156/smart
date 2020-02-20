package org.account.domain.account.entity;

import lombok.Data;
import org.account.domain.account.valueobj.permission.PermissionId;
import org.account.domain.account.valueobj.user.UserRoleId;

/**
 * @author "yangbiao"
 */
@Data
public class RoleAndPermission {
    private Long id;
    private UserRoleId roleId;
    private PermissionId permissionId;
}
