package org.account.domain.account.valueobj.role;

/**
 * @author "yangbiao"
 */
public class RoleId extends AbstructRole {
    private Long id;

    RoleId(Long Id) {
        id = Id;
    }

    public Long getId() {
        return id;
    }
}
