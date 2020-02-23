package org.admin.domain.entity;

import lombok.Data;
import org.admin.domain.valueobj.id.PermissionId;
import org.admin.domain.valueobj.id.UserId;

/**
 * @author "yangbiao"
 */
@Data
public class UserAndPermission {
    private Long id;
    private UserId userId;
    private PermissionId permissionId;

}
