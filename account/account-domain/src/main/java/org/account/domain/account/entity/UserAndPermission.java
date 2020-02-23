package org.account.domain.account.entity;

import lombok.Data;
import org.account.domain.account.valueobj.id.PermissionId;
import org.account.domain.account.valueobj.id.UserId;

/**
 * @author "yangbiao"
 */
@Data
public class UserAndPermission {
    private Long id;
    private UserId userId;
    private PermissionId permissionId;

}
