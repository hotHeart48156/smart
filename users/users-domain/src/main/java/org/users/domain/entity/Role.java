package org.users.domain.entity;

import org.users.domain.valueobject.id.RoleId;
import org.users.domain.valueobject.id.UserId;
import org.users.domain.valueobject.is.AbstractIs;
import org.users.domain.valueobject.name.RoleName;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import java.util.Set;

/**
 * @author "yangbiao"
 */

public class Role {
    @EmbeddedId
private RoleId roleId;
    @Embedded
private RoleName roleName;
    @Embedded
private UserId userId;
    @Embedded
private  Set<AbstractIs> permissions;
}
