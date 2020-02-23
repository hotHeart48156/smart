package org.admin.domain.entity;

import lombok.Data;
import org.account.domain.account.valueobj.id.EducationId;
import org.account.domain.account.valueobj.id.PermissionId;
import org.account.domain.account.valueobj.id.RoleId;
import org.account.domain.account.valueobj.id.UserId;
import org.admin.domain.valueobj.id.UserId;


/**
 * @author "yangbiao"
 */
@Data
public class Account {
    private UserId userId;
    private PermissionId permissionId;
    private RoleId roleId;
    private EducationId educationId;
}
