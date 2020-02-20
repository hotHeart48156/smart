package org.account.domain.account.valueobj.permission;

/**
 * @author "yangbiao"
 */
public class PermissionId extends AbstructPermission {
    private Long Id;

    PermissionId(Long id) {
        Id = id;
    }

    public Long getId() {
        return Id;
    }
}
