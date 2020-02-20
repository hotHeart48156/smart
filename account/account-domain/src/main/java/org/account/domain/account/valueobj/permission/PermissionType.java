package org.account.domain.account.valueobj.permission;

/**
 * @author "yangbiao"
 */
public class PermissionType extends AbstructPermission {
    private Integer type;

    PermissionType(Integer Type) {
        type = Type;
    }

    public Integer getType() {
        return type;
    }
}
