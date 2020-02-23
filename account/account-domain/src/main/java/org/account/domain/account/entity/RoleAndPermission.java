package org.account.domain.account.entity;

import lombok.Data;
import org.account.domain.account.valueobj.id.PermissionId;
import org.account.domain.account.valueobj.id.RoleId;


/**
 * @author "yangbiao"
 */
@Data
public class RoleAndPermission {
    private Long id;
    private RoleId roleId;
    private PermissionId permissionId;
}
