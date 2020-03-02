package org.users.domain.customer.entity;

import org.users.domain.customer.valueobject.id.RoleId;
import org.users.domain.customer.valueobject.id.UserId;
import org.users.domain.customer.valueobject.is.AbstractIs;
import org.users.domain.customer.valueobject.name.RoleName;

import java.util.Set;

/**
 * @author "yangbiao"
 */

public class Role {
    private RoleId roleId;
    private RoleName roleName;
    private UserId userId;
    private Set<AbstractIs> permissions;
}
