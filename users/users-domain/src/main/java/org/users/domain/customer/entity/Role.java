package org.users.domain.customer.entity;

import org.users.domain.customer.valueobject.id.PermissionId;
import org.users.domain.customer.valueobject.id.RoleId;
import org.users.domain.customer.valueobject.id.UserId;
import org.users.domain.customer.valueobject.type.RoleType;

import java.util.Map;
import java.util.Set;

/**
 * @author "yangbiao"
 */

public class Role {
    private RoleId roleId;
    private UserId userId;
    private Set<PermissionId> permissionIds;
    private RoleType roleType;
}
