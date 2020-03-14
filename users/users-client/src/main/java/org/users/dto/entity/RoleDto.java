package org.users.dto.entity;

@Data
public class RoleDto {
    private String roleId;
    private String roleName;
    private String userId;
    private String Set<AbstractIs>
    private String createTime;
    private String roleStatus;

    public void accept(Role role) {
        role.setRoleId(ValueObjectFactory.newInstance(RoleId.class, roleId));
        role.setRoleName(ValueObjectFactory.newInstance(RoleName.class, roleName));
        role.setUserId(ValueObjectFactory.newInstance(UserId.class, userId));
        role.set(ValueObjectFactory.newInstance(. class ,Set<AbstractIs));
        role.setCreateTime(ValueObjectFactory.newInstance(CreateTime.class, createTime));
        role.setRoleStatus(ValueObjectFactory.newInstance(RoleStatus.class, roleStatus));
    }
}
