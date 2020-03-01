package org.admin.domain.entity;

import lombok.Data;
import org.admin.domain.valueobj.id.EducationId;
import org.admin.domain.valueobj.id.PermissionId;
import org.admin.domain.valueobj.id.RoleId;
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
