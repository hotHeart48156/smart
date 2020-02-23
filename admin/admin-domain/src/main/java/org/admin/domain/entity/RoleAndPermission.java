package org.admin.domain.entity;

import lombok.Data;
import org.admin.domain.valueobj.id.PermissionId;
import org.admin.domain.valueobj.id.RoleId;


/**
 * @author "yangbiao"
 */
@Data
public class RoleAndPermission {
    private Long id;
    private RoleId roleId;
    private PermissionId permissionId;
}
