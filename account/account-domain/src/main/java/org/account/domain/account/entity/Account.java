package org.account.domain.account.entity;

import lombok.Data;
import org.account.domain.account.valueobj.education.EducationId;
import org.account.domain.account.valueobj.permission.PermissionId;
import org.account.domain.account.valueobj.role.RoleId;
import org.account.domain.account.valueobj.user.UserId;

/**
 * @author "yangbiao"
 */
@Data
public class Account {
    UserId userId;
    PermissionId permissionId;
    RoleId roleId;
    EducationId educationId;
}
