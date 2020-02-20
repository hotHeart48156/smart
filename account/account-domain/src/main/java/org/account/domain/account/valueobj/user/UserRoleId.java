package org.account.domain.account.valueobj.user;

/**
 * @author "yangbiao"
 */
public class UserRoleId extends AbstructUser {

    private UserRoleId roleId;

    UserRoleId(UserRoleId roleId1) {
        roleId = roleId1;
    }

    public UserRoleId getRoleId() {
        return roleId;
    }
}
