package org.users.dto.entity;

import lombok.Data;
import org.users.domain.entity.Role;
import org.users.domain.valueobject.CreateTime;
import org.users.domain.valueobject.ValueObjectFactory;
import org.users.domain.valueobject.id.RoleId;
import org.users.domain.valueobject.id.UserId;
import org.users.domain.valueobject.name.RoleName;
import org.users.domain.valueobject.status.RoleStatus;

@Data
public class RoleDto {
    private String roleId;
    private String roleName;
    private String userId;
    private String createTime;
    private String roleStatus;

    public void accept(Role role) {
        role.setRoleId(ValueObjectFactory.newInstance(RoleId.class, roleId));
        role.setRoleName(ValueObjectFactory.newInstance(RoleName.class, roleName));
        role.setUserId(ValueObjectFactory.newInstance(UserId.class, userId));
        role.setCreateTime(ValueObjectFactory.newInstance(CreateTime.class, createTime));
        role.setRoleStatus(ValueObjectFactory.newInstance(RoleStatus.class, roleStatus));
    }
}
