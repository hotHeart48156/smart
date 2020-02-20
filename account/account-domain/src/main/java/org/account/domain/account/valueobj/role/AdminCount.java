package org.account.domain.account.valueobj.role;

/**
 * @author "yangbiao"
 */
public class AdminCount extends AbstructRole {
    private Integer adminCount;

    AdminCount(Integer adminCount) {
        adminCount = adminCount;

    }

    public Integer getadminCount() {
        return adminCount;
    }
}
