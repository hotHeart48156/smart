package org.account.domain.account.entity;

import lombok.Data;
import org.account.domain.account.valueobj.permission.PermissionId;
import org.account.domain.account.valueobj.user.UserId;

/**
 * @author "yangbiao"
 */
@Data
public class UserAndPermission {
    private Long id;
    private UserId userId;
    private PermissionId permissionId;

}
